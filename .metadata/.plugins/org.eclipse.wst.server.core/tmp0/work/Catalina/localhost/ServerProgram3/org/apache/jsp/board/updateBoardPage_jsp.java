/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-06-16 12:11:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class updateBoardPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1623834787882L));
    _jspx_dependants.put("jar:file:/C:/spring0303/jspstudy/work2/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/ServerProgram3/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425946270000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
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
      out.write("\r\n");
      out.write("\r\n");
 request.setCharacterEncoding("utf-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t");

		request.setCharacterEncoding("utf-8");
	
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"assets/css/layout.css\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.update_form {\r\n");
      out.write("\t\t\twidth: 600px;\r\n");
      out.write("\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\tinput[type=text] {\r\n");
      out.write("\t\t\tpadding: 5px;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\ttextarea {\r\n");
      out.write("\t\t\tpadding: 5px;\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\theight: 200px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.btns {\r\n");
      out.write("\t\t\tmargin: 0 auto;\r\n");
      out.write("\t\t\twidth: 500px;\r\n");
      out.write("\t\t\ttext-align: center;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.btn {\r\n");
      out.write("\t\t\twidth: 150px;\r\n");
      out.write("\t\t\theight: 40px;\r\n");
      out.write("\t\t\tline-height: 40px;\r\n");
      out.write("\t\t\tbackground: orange;\r\n");
      out.write("\t\t\tborder: none;\r\n");
      out.write("\t\t\toutline: none;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.btn:hover {\r\n");
      out.write("\t\t\tbackground: crimson;\r\n");
      out.write("\t\t\tcolor: white;\r\n");
      out.write("\t\t\tcursor: pointer;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconst list_btn = $('#list_btn');\r\n");
      out.write("\t\t\tlist_btn.click(function(){\r\n");
      out.write("\t\t\t\tlocation.href = '/ServerProgram3/selectListBoardPage.do';\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("\t</head>\r\n");
      out.write("\t<div class=\"update_form\">\r\n");
      out.write("\t\t<form action=\"/ServerProgram3/updateBoard.do\" id=\"f\" method=\"post\">\r\n");
      out.write("\t\t\t<p class=\"title\">제목</p>\r\n");
      out.write("\t\t\t<input type=\"text\" id=\"title\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"><br><br>\r\n");
      out.write("\t\t\t<p class=\"content\">내용</p>\r\n");
      out.write("\t\t\t<textarea id=\"content\" name=\"content\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</textarea><br><br>\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"idx\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.idx}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t<div class=\"btns\">\r\n");
      out.write("\t\t\t\t<button class=\"btn\">수정하기</button>\r\n");
      out.write("\t\t\t\t<input type=\"reset\" value=\"수정초기화\" class=\"btn\" id=\"reset_btn\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" value=\"목록보기\" class=\"btn\" id=\"list_btn\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("</html>\r\n");
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
