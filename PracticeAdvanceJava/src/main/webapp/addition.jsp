<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import = "java.util.Date" errorPage="errorPge.jsp" %> <!-- direction tag -->

    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%! int s=20; int l=90; %> <!-- declaration tag -->

<%		/*scriplet tag*/

int a = Integer.parseInt(request.getParameter("num1"));
int b = Integer.parseInt(request.getParameter("num2"));
int c = a/b;
out.print(c);



//response.sendRedirect("http://www.google.com");  

%>
<% 
out.print(new Date());
 %>
<br>
<br>
your value is <%= c+s%> <!-- expression tag -->
<br>
<br>
   <%@ include file = "index.html" %> <!-- Directive tag -->


</body>
</html>										