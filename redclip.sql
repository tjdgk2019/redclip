CREATE TABLE search_queries (
    id NUMBER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    search_term VARCHAR2(255) NOT NULL,
    search_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE popular_searches (
    id NUMBER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY,
    search_term VARCHAR2(255) NOT NULL,
    search_count NUMBER NOT NULL,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

BEGIN
    -- 최근 검색어 데이터를 임시 테이블에 삽입
    INSERT INTO temp_recent_searches (search_term, search_count)
    SELECT search_term, COUNT(*) AS search_count
    FROM search_queries
    WHERE search_time >= SYSTIMESTAMP - INTERVAL '15' MINUTE
    GROUP BY search_term
    ORDER BY search_count DESC
    FETCH FIRST 20 ROWS ONLY;

    -- 인기 검색어를 업데이트하거나 삽입하기 위한 MERGE 문 실행
    MERGE INTO popular_searches ps
    USING temp_recent_searches rs
    ON (ps.search_term = rs.search_term)
    WHEN MATCHED THEN
        UPDATE SET 
            ps.search_count = rs.search_count, 
            ps.updated_at = SYSTIMESTAMP
    WHEN NOT MATCHED THEN
        INSERT (search_term, search_count, updated_at)
        VALUES (rs.search_term, rs.search_count, SYSTIMESTAMP);

    -- 오래된 기록 삭제
    DELETE FROM popular_searches
    WHERE updated_at < SYSTIMESTAMP - INTERVAL '15' MINUTE;

    -- 임시 테이블 데이터 삭제
    EXECUTE IMMEDIATE 'TRUNCATE TABLE temp_recent_searches';

END;
