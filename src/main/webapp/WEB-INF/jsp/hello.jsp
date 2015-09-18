<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link href="/css/bootstrap.min.css" rel="stylesheet">
    </head>


    <script language="javascript" type="text/javascript">
        function setThings() {
        }
    </script>


    <body onLoad="javascript:setThings();">

        <c:forEach var="lapx" items="${laps}">
            <tr>
                <td>
                    <jsp:include page="lapTotals.jsp">
                        <jsp:param name="distance" value="${lap.totals.distance}"/>
                        <jsp:param name="distUnit" value="${lap.totals.distUnit}"/>
                        <jsp:param name="time" value="${lap.totals.time}"/>
                    </jsp:include>
                </td>
            </tr>
        </c:forEach>

        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="/js/bootstrap.min.js"></script>
    </body>

</html>