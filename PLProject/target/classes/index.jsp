<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Parkinglot Manager</title>
</head>
<body>
<div align="center">
    <h2>Parkinglot Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/new">New Cars</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>ID</th>
            <th>Model</th>
            <th>Mark</th>
            <th>Color</th>
            <th>OwnerName</th>
            <th>Numberplate</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listCars}" var="cars">
        <tr>
            <td>${cars.id}</td>
            <td>${cars.model}</td>
            <td>${cars.mark}</td>
            <td>${cars.color}</td>
            <td>${cars.ownername}</td>
            <td>${cars.numberplate}</td>
            <td>
                <a href="/edit?id=${cars.id}">Edit</a>

                <a href="/delete?id=${cars.id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>