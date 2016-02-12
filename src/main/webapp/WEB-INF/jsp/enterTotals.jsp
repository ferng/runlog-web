<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Home</title>
</head>
<body>
<div align="center">
    <table border="1">
        <form:form action="save" method="post" modelAttribute="total">
            <form:hidden path="id"/>
            <tr>
                <td>distance</td>
                <td><form:input path="distance"/></td>
            </tr>
            <tr>
                <td>time</td>
                <td><form:input path="time"/></td>
            </tr>
            <tr>
                <td>mph</td>
                <td><form:input path="mph"/></td>
            </tr>
            <tr>
                <td>min per mile</td>
                <td><form:input path="minPerMile"/></td>
            </tr>
            <tr>
                <td>dist. unit</td>
                <td><form:input path="distUnit"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="Save">
                </td>
            </tr>
        </form:form>

    </table>
</div>
</body>
</html>
