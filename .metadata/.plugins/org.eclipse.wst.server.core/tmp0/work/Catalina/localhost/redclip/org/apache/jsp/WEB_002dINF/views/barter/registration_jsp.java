/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.87
 * Generated at: 2024-07-31 08:20:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.barter;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registration_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>상품 등록</title>\r\n");
      out.write("<link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("  <style>\r\n");
      out.write("  .container {margin-bottom: 80px;}\r\n");
      out.write("  .title {margin-top: 40px; margin-bottom: 20px;}\r\n");
      out.write("  .form-row {\r\n");
      out.write("   display: flex;\r\n");
      out.write("   padding: 0;\r\n");
      out.write("   margin: 0;\r\n");
      out.write(" }\r\n");
      out.write(" .image-placeholder {\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 260px;\r\n");
      out.write("   display: flex;\r\n");
      out.write("   align-items: center;\r\n");
      out.write("   overflow: hidden;\r\n");
      out.write("   border: 1px solid #ddd;\r\n");
      out.write("}\r\n");
      out.write(" .image-preview {\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 100%;\r\n");
      out.write("   object-fit: cover;\r\n");
      out.write("   display: none;\r\n");
      out.write(" }\r\n");
      out.write(" .file-input {\r\n");
      out.write("   position: absolute;\r\n");
      out.write("   top: 0;\r\n");
      out.write("   left: 0;\r\n");
      out.write("   width: 100%;\r\n");
      out.write("   height: 100%;\r\n");
      out.write("   opacity: 0;\r\n");
      out.write(" }\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/header.jsp", out, false);
      out.write("\r\n");
      out.write("  <div class=\"container\" style=\"max-width: 1140px;\">\r\n");
      out.write("	<!-- breadcrumb -->\r\n");
      out.write("	<section>\r\n");
      out.write("    <nav aria-label=\"breadcrumb\">\r\n");
      out.write("        <ol class=\"breadcrumb\">\r\n");
      out.write("	        <img src=\"/redclip/resources/img/house-door-fill.svg\" style=\"margin-right: 4px\" />\r\n");
      out.write("	        <li class=\"breadcrumb-item\"><a href=\"/redclip\">홈</a></li>\r\n");
      out.write("	        <li class=\"breadcrumb-item\"><a href=\"/redclip/barters\">상품목록</a></li>\r\n");
      out.write("	        <li class=\"breadcrumb-item active\" aria-current=\"page\">게시글 등록</li>\r\n");
      out.write("	    </ol>\r\n");
      out.write("	</nav>\r\n");
      out.write("    <h2 class=\"title\">게시글 등록</h2>\r\n");
      out.write("    <form id=\"enrollForm\" method=\"post\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("/barters/insert\" enctype=\"multipart/form-data\">\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("       <label for=\"name\">상품명</label>\r\n");
      out.write("        <div class=\"input-group\">\r\n");
      out.write("          <select class=\"form-control\" id=\"categoryNo\" name=\"categoryNo\" style=\"max-width: 150px;\" required>\r\n");
      out.write("            <option>카테고리</option>\r\n");
      out.write("            <option value=\"1\">디지털기기</option>\r\n");
      out.write("            <option value=\"2\">가구/인테리어</option>\r\n");
      out.write("            <option value=\"3\">유아용품</option>\r\n");
      out.write("            <option value=\"4\">여성의류</option>\r\n");
      out.write("            <option value=\"5\">여성잡화</option>\r\n");
      out.write("            <option value=\"6\">남성의류</option>\r\n");
      out.write("            <option value=\"7\">남성잡화</option>\r\n");
      out.write("            <option value=\"8\">생활가전</option>\r\n");
      out.write("            <option value=\"9\">주방용품</option>\r\n");
      out.write("            <option value=\"10\">스포츠/레저</option>\r\n");
      out.write("            <option value=\"11\">게임/음반</option>\r\n");
      out.write("            <option value=\"12\">뷰티/미용</option>\r\n");
      out.write("            <option value=\"13\">식물</option>\r\n");
      out.write("            <option value=\"14\">가공식품</option>\r\n");
      out.write("            <option value=\"15\">건강기능식품</option>\r\n");
      out.write("            <option value=\"16\">반려동물용품</option>\r\n");
      out.write("            <option value=\"17\">티켓/교환권</option>\r\n");
      out.write("            <option value=\"18\">도서</option>\r\n");
      out.write("          </select>\r\n");
      out.write("          <input type=\"text\" class=\"form-control\" id=\"name\" name=\"barterName\" maxlength=\"250\" placeholder=\"내용을 입력해주세요.\" required>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <input type=\"hidden\" id=\"writer\" class=\"form-control\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginUser.userId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" name=\"barterWriter\" readonly>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("        <label>주소 입력</label>\r\n");
      out.write("        <div class=\"form-row\">\r\n");
      out.write("          <div class=\"col\">\r\n");
      out.write("            <select class=\"form-control\" id=\"si\" required>\r\n");
      out.write("              <option value=\"\">시 선택</option>\r\n");
      out.write("              <option value=\"1\">서울특별시</option>\r\n");
      out.write("              <option value=\"2\">인천광역시</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col\">\r\n");
      out.write("            <select class=\"form-control\" id=\"gu\" disabled>\r\n");
      out.write("              <option value=\"\">구 선택</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("          <div class=\"col\">\r\n");
      out.write("            <select class=\"form-control\" id=\"dong\" name=\"villageCode\" disabled>\r\n");
      out.write("              <option value=\"\">동 선택</option>\r\n");
      out.write("            </select>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("	    <label for=\"productDescription\">상세 설명</label>\r\n");
      out.write("	    <textarea class=\"form-control\" id=\"barterContent\" name=\"barterContent\" rows=\"4\" placeholder=\"내용을 입력해주세요.\"></textarea>\r\n");
      out.write("	  </div>\r\n");
      out.write("      <div class=\"form-group\">\r\n");
      out.write("	    <label>이미지 등록</label>\r\n");
      out.write("	    <div class=\"form-row\">\r\n");
      out.write("	        <div class=\"col image-placeholder\">\r\n");
      out.write("	            <img id=\"imagePreview1\" class=\"image-preview\" src=\"\" alt=\"이미지 미리보기\">\r\n");
      out.write("	            <input type=\"file\" id=\"upfile\" class=\"file-input\" name=\"upfile\" onchange=\"loadImg(this, 1)\">\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <div class=\"col image-placeholder\">\r\n");
      out.write("	            <img id=\"imagePreview2\" class=\"image-preview\" src=\"\" alt=\"이미지 미리보기\">\r\n");
      out.write("	            <input type=\"file\" id=\"upfile\" class=\"file-input\" name=\"upfile\" onchange=\"loadImg(this, 2)\">\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <div class=\"col image-placeholder\">\r\n");
      out.write("	            <img id=\"imagePreview3\" class=\"image-preview\" src=\"\" alt=\"이미지 미리보기\">\r\n");
      out.write("	            <input type=\"file\" id=\"upfile\" class=\"file-input\" name=\"upfile\" onchange=\"loadImg(this, 3)\">\r\n");
      out.write("	        </div>\r\n");
      out.write("	        <div class=\"col image-placeholder\">\r\n");
      out.write("	            <img id=\"imagePreview4\" class=\"image-preview\" src=\"\" alt=\"이미지 미리보기\">\r\n");
      out.write("	            <input type=\"file\" id=\"upfile\" class=\"file-input\" name=\"upfile\" onchange=\"loadImg(this, 4)\">\r\n");
      out.write("	        </div>\r\n");
      out.write("	    </div>\r\n");
      out.write("	 </div>\r\n");
      out.write("     <button type=\"submit\" class=\"btn btn-success\">등록하기</button>\r\n");
      out.write("     </form>\r\n");
      out.write("    </section>\r\n");
      out.write("  </div>\r\n");
      out.write("  <script>\r\n");
      out.write("  $(() => {\r\n");
      out.write("	    const $siSelect = $('#si');\r\n");
      out.write("	    const $guSelect = $('#gu');\r\n");
      out.write("	    const $dongSelect = $('#dong');\r\n");
      out.write("	\r\n");
      out.write("	    $siSelect.change(() => {\r\n");
      out.write("	        const siValue = $siSelect.val();  \r\n");
      out.write("			console.log(siValue);\r\n");
      out.write("	        if (siValue !== null ) { //시벨류값이 널이 아닐때 실행)\r\n");
      out.write("	             console.log(\"시밸류값:\", siValue); \r\n");
      out.write("	            $.ajax({\r\n");
      out.write("	                url: '/redclip/member/guSelect', \r\n");
      out.write("	                type: 'GET',\r\n");
      out.write("	                data: { si: siValue }, \r\n");
      out.write("	                success: response => {\r\n");
      out.write("	                	 console.log(response);\r\n");
      out.write("	                	$guSelect.empty().append('<option value=\"\">구 선택</option>');\r\n");
      out.write("	                    response.forEach((a) => { \r\n");
      out.write("	                    	$guSelect.append('<option value='+a.townCode+'>'+a.townName+'</option>');\r\n");
      out.write("	                    });\r\n");
      out.write("	                    $guSelect.prop('disabled', false); // 구 셀렉트 박스 활성화\r\n");
      out.write("	                },\r\n");
      out.write("	                error: function() {\r\n");
      out.write("	                    alert('오류가 발생했습니다.');\r\n");
      out.write("	                }\r\n");
      out.write("	            });\r\n");
      out.write("	        }\r\n");
      out.write("	    });\r\n");
      out.write("	   \r\n");
      out.write("	    $guSelect.change(() => {\r\n");
      out.write("	    	 const guValue = $guSelect.val();\r\n");
      out.write("	         console.log(\"선택한구벨류값:\", guValue);\r\n");
      out.write("	    	if (guValue !== null) {\r\n");
      out.write("	    		$.ajax({\r\n");
      out.write("		    		url: '/redclip/member/dongSelect',\r\n");
      out.write("		    		type: 'GET',\r\n");
      out.write("		    		data: { gu: guValue },\r\n");
      out.write("		    		success: response => {\r\n");
      out.write("		    			console.log(response);\r\n");
      out.write("		    			$dongSelect.empty().append('<option value=\"\">동 선택</option>')\r\n");
      out.write("		    			response.forEach((a) => {\r\n");
      out.write("		    				$dongSelect.append('<option value='+a.villageCode+'>'+a.villageName+'</option>');\r\n");
      out.write("		    			});\r\n");
      out.write("		    			$dongSelect.prop('disabled', false); // 동 셀렉트 박스 활성화\r\n");
      out.write("		    		},\r\n");
      out.write("		    		error: function() {\r\n");
      out.write("		    			alert('오류가 발생했습니다.');\r\n");
      out.write("		    		}\r\n");
      out.write("	    		});\r\n");
      out.write("	    	}\r\n");
      out.write("	    });\r\n");
      out.write("	});\r\n");
      out.write("\r\n");
      out.write("	function loadImg(inputFile, index) {\r\n");
      out.write("	    const previewImage = document.getElementById('imagePreview' + index);\r\n");
      out.write("\r\n");
      out.write("	    if (inputFile.files.length) {\r\n");
      out.write("	        const reader = new FileReader();\r\n");
      out.write("	        \r\n");
      out.write("	        reader.readAsDataURL(inputFile.files[0]);\r\n");
      out.write("	        reader.onload = function (e) {\r\n");
      out.write("	            previewImage.src = e.target.result;\r\n");
      out.write("	            previewImage.style.display = 'block';\r\n");
      out.write("	        };\r\n");
      out.write("	    } else {\r\n");
      out.write("	        previewImage.src = \"\";\r\n");
      out.write("	        previewImage.style.display = 'none';\r\n");
      out.write("	    }\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("  </script>\r\n");
      out.write("  ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "/WEB-INF/views/common/footer.jsp", out, false);
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
