/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.53
 * Generated at: 2020-06-30 07:51:22 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.multi.dao.MDBoardDao;
import com.multi.dto.MDBoardDto;
import java.util.List;

public final class boardlist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/./form/header.jsp", Long.valueOf(1593401040953L));
    _jspx_dependants.put("/./form/footer.jsp", Long.valueOf(1593401388737L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.multi.dto.MDBoardDto");
    _jspx_imports_classes.add("com.multi.dao.MDBoardDao");
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
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
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
 request.setCharacterEncoding("UTF-8") ;
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\" src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\tfunction allChk(bool){\r\n");
      out.write("\t\tvar chks = document.getElementsByName(\"chk\");\r\n");
      out.write("\t\tfor(var i=0; i<chks.length; i++){\r\n");
      out.write("\t\t\tchks[i].checked = bool;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t//체크를 하나도 안하면 submit 이벤트 취소\r\n");
      out.write("\t$(function(){\r\n");
      out.write("\t\t$(\"#muldelform\").submit(function(){\r\n");
      out.write("\t\t\tif($(\"#muldelform input:checked\").length == 0){\r\n");
      out.write("\t\t\t\talert(\"하나 이상 체크해주세요!\");\r\n");
      out.write("\t\t\t\treturn false;\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t});\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");

	MDBoardDao dao = new MDBoardDao();
	List<MDBoardDto> list = dao.selectAll();

      out.write('\r');
      out.write('\n');
      out.write("\r\n");
      out.write("    \r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\theader{\r\n");
      out.write("\t\tbackground-color: skyblue;\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\tfooter{\r\n");
      out.write("\t\tbackground-color: skyblue;\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tline-height: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\ta{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<header><a href=\"../boardlist.jsp\">게시판 구현하기</a></header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h1>L I S T</h1>\r\n");
      out.write("\t<form action=\"muldel.jsp\" method=\"post\" id=\"muldelform\">\r\n");
      out.write("\t\t<table border=\"1\">\r\n");
      out.write("\t\t\t<col width=\"30px\"><col width=\"50px\"><col width=\"100px\">\r\n");
      out.write("\t\t\t<col width=\"300px\"><col width=\"100px\"> \r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th><input type=\"checkbox\" name=\"all\" onclick=\"allChk(this.checked);\"></th>\r\n");
      out.write("\t\t\t\t<th>NO</th>\r\n");
      out.write("\t\t\t\t<th>WRITER</th>\r\n");
      out.write("\t\t\t\t<th>TITLE</th>\r\n");
      out.write("\t\t\t\t<th>DATE</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				if(list.size()==0){
			
      out.write("\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td colspan=\"5\">-----글이 존재하지 않습니다.-----</td>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

				}else{
					for(MDBoardDto dto:list){
			
      out.write("\r\n");
      out.write("\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t<td><input type=\"checkbox\" name=\"chk\" value=\"");
      out.print(dto.getSeq() );
      out.write("\"></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(dto.getSeq() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(dto.getWriter() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t\t<td><a href=\"boarddetail.jsp?seq=");
      out.print(dto.getSeq() );
      out.write('"');
      out.write('>');
      out.write(' ');
      out.print(dto.getTitle() );
      out.write("</a></td>\r\n");
      out.write("\t\t\t\t\t\t<td>");
      out.print(dto.getRegdate() );
      out.write("</td>\r\n");
      out.write("\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t");

					}
				}
			
      out.write("\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"5\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"삭제\" >\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"글쓰기\" onclick=\"location.href='boardwrite.jsp'\">\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    \r\n");
 request.setCharacterEncoding("UTF-8"); 
      out.write('\r');
      out.write('\n');
 response.setContentType("text/html; charset=UTF-8"); 
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\theader{\r\n");
      out.write("\t\tbackground-color: skyblue;\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\tfooter{\r\n");
      out.write("\t\tbackground-color: skyblue;\r\n");
      out.write("\t\theight: 50px;\r\n");
      out.write("\t\ttext-align: center;\r\n");
      out.write("\t\tline-height: 50px;\r\n");
      out.write("\t}\r\n");
      out.write("\ta{\r\n");
      out.write("\t\ttext-decoration: none;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<footer>kh정보교육원 &copy; all rights reserved ...</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
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
