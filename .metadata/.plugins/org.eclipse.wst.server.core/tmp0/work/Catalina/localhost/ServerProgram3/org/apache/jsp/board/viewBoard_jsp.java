/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.65
 * Generated at: 2021-06-16 12:16:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class viewBoard_jsp extends org.apache.jasper.runtime.HttpJspBase
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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
 request.setCharacterEncoding("utf-8"); 
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"UTF-8\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"../assets/css/layout.css\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t.board_view {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tdisplay: flex;\r\n");
      out.write("\t\t\tjustify-content: space-between;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.board_content {\r\n");
      out.write("\t\t\twidth: 40%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.board_img {\r\n");
      out.write("\t\t\twidth: 55%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.board_img > img {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.reply_form {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.reply_form textarea {\r\n");
      out.write("\t\t\twidth: 85%;\r\n");
      out.write("\t\t\theight: 50px;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.reply_form button {\r\n");
      out.write("\t\t\twidth: 13%;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.reply_list table {\r\n");
      out.write("\t\t\twidth: 100%;\r\n");
      out.write("\t\t\tborder-collapse: collapse;\r\n");
      out.write("\t\t\tborder-top: 1px solid gray;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid gray;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.reply_list table td {\r\n");
      out.write("\t\t\tpadding: 10px;\r\n");
      out.write("\t\t\tborder-bottom: 1px solid gray;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t.reply_list table td:nth-of-type(1) { width: 70%; }\r\n");
      out.write("\t\t.reply_list table td:nth-of-type(2) { width: 10%; }\r\n");
      out.write("\t\t.reply_list table td:nth-of-type(3) { width: 15%; }\r\n");
      out.write("\t\t.reply_list table td:nth-of-type(4) { width: 5%; }\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.6.0.min.js\" integrity=\"sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t$(document).ready(function(){\r\n");
      out.write("\t\t\tconst delete_btn = $('#delete_btn');\r\n");
      out.write("\t\t\tdelete_btn.click(function(){\r\n");
      out.write("\t\t\t\tif (confirm('삭제할까요?')) {\r\n");
      out.write("\t\t\t\t\tlocation.href='/ServerProgram3/deleteBoard.do?no=");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("';\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t})\r\n");
      out.write("\t\t})\r\n");
      out.write("\t</script>\r\n");
      out.write("</head>\r\n");
      out.write("\t<div class=\"board_view\">\r\n");
      out.write("\t\t<div class=\"board_content\">\r\n");
      out.write("\t\t\t<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("번 게시글</h1>\r\n");
      out.write("\t\t\t<p class=\"title\">작성자</p>\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br><br>\r\n");
      out.write("\t\t\t<p class=\"title\">작성자IP</p>\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.ip}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br><br>\r\n");
      out.write("\t\t\t<p class=\"title\">조회수</p>\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.hit}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br><br>\r\n");
      out.write("\t\t\t<p class=\"title\">제목</p>\r\n");
      out.write("\t\t\t");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("<br><br>\r\n");
      out.write("\t\t\t<p class=\"title\">내용</p>\r\n");
      out.write("\t\t\t<pre>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</pre><br><br>\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<form action=\"/ServerProgram3/updateBoardPage.do\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"목록보기\" onclick=\"location.href='");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${referer}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("'\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"no\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.title}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"content\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("\t\t\t<input type=\"button\" value=\"삭제하기\" id=\"delete_btn\">\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div class=\"reply_form\">\r\n");
      out.write("\t\t<form action=\"/ServerProgram3/insertReply.do\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"boardNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${dto.no}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\"> \r\n");
      out.write("\t\t\t<textarea name=\"content\"></textarea>\r\n");
      out.write("\t\t\t<button>작성하기</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\t<div class=\"reply_list\">\r\n");
      out.write("\t\t댓글 ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyCount}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("개<br>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</tbody>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /board/viewBoard.jsp(100,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("replyDTO");
      // /board/viewBoard.jsp(100,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/board/viewBoard.jsp(100,4) '${replyList}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${replyList}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t\t<tr>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyDTO.content}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyDTO.author}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t\t<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${replyDTO.postdate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t\t</tr>\r\n");
            out.write("\t\t\t\t");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
