<%--
  Created by IntelliJ IDEA.
  User: cl
  Date: 2020/4/19
  Time: 14:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1><a href="/boot/findstu">查找所有信息</a></h1>
<%--<span style="color: red">${ msg }</span>--%>
<br>
<h3>添加信息</h3>
<form action="/boot/addstu" method="post">
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<h3>更改信息</h3>
<form action="/boot/updatestu" method="post">
    id: <input type="text" name="id"><br>
    姓名：<input type="text" name="name"><br>
    年龄：<input type="text" name="age"><br>
    <input type="submit" value="提交">
</form>
<br>
<form action="/boot/deletestu" method="post">
    删除ID为<input type="text" name="id">的数据
    <input type="submit" value="确认删除">
</form>
<br>
<form action="/boot/deletestuerror" method="post">
    此为测试异常：<br>
    删除ID为<input type="text" name="id">的数据
    <input type="submit" value="确认删除">
</form>
<br>
<a href="/boot/restfull/12/倒计时/53">RESTFull实现</a>
</body>
</html>
