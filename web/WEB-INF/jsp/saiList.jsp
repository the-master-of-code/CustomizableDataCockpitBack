<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2020/5/3
  Time: 11:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<table class="table table-hover table-striped">
    <thead>
    <tr>
        <th>销量及库存编号</th>
        <th>货物名字</th>
        <th>销售数量</th>
        <th>库存数量</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach var="SAI" items="${requestScope.get('SAIList')}">

        <tr>
            <td>${SAI.getId()}</td>
            <td>${SAI.getGoodsName()}</td>
            <td>${SAI.getSales()}</td>
            <td>${SAI.getInventory()}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
