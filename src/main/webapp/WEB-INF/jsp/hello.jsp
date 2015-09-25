<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="html" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <link rel='stylesheet' href='webjars/bootstrap/3.3.5/css/bootstrap.min.css'>
    </head>


    <script language="javascript" type="text/javascript">
        function setThings() {

        }
    </script>


    <body onLoad="javascript:setThings();">

        <script language="javascript" type="text/javascript">
            var body = document.body;
            var tbl = document.createElement('table');
            tbl.style.width = '100px';
            tbl.style.border = '1px solid black';
        </script>

        <c:forEach var="lapGroup" items="${groupedLaps}">
            <tr>
                <c:forEach var="lap" items="${lapGroup}">
                    <td>
                        <jsp:include page="lapTotals.jsp">
                            <jsp:param name="distance" value="${lap.totals.distance}"/>
                            <jsp:param name="distUnit" value="${lap.totals.distUnit}"/>
                            <jsp:param name="time" value="${lap.totals.time}"/>
                        </jsp:include>
                    </td>
                </c:forEach>
            </tr>
        </c:forEach>


        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script src="/js/bootstrap.min.js"></script>
    </body>

</html>