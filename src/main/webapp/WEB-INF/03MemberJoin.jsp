<%--
  Created by IntelliJ IDEA.
  User: 김민규
  Date: 2022-07-04
  Time: 오후 4:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!-- /Join.do에 post 방식으로 값 전달-->
<form action="/Join.do" method="post">
EMAIL : <input type="text" name="email"><br>
PWD : <input type="text" name="pwd"><br>
ADDR1 : <input type="text" name="addr1"><br>
ADDR2 : <input type="text" name="addr2"><br>
    <input type="submit" value="제출">
</form>
</body>
</html>
