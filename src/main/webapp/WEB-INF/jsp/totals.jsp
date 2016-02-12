<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<div align="center">
    <table border="1">
        <th>distance</th>
        <th>time</th>
        <th>mph</th>
        <th>min per mile</th>
        <th>dist. unit</th>

        <c:forEach var="totals" items="${myTotals}">
            <tr>
                <td>${totals.distance}</td>
                <td>${totals.time}</td>
                <td>${totals.mph}</td>
                <td>${totals.minPerMile}</td>
                <td>${totals.distUnit}</td>

            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>
