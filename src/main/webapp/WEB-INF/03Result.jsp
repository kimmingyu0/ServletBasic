<%--
  Created by IntelliJ IDEA.
  User: 김민규
  Date: 2022-07-04
  Time: 오후 4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    //Ch02/C03Servlet에서 받아오고 전달해준 값 받아오기
  String email = request.getParameter("email");
  String pwd = request.getParameter("pwd");
  String addr1 = request.getParameter("addr1");
  String addr2 = request.getParameter("addr2");
%>

email : <%=email %><br>
pwd : <%=pwd %><br>
addr1 : <%=addr1 %><br>
addr2 : <%=addr2 %><br>
<a href="/Ch02/03Login.jsp">초기화면으로 돌아가기</a>
</body>
</html>
