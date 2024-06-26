<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <title>Skaičiuotuvas</title>
    <jsp:include page="header.jsp"/>

    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;600&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

    <style>
        body {
            font-family: 'Poppins', sans-serif;
            background-color: #080710;
            color: white;
        }
        .container {
            max-width: 800px;
            margin: 50px auto;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            background-color: rgba(255, 255, 255, 0.13);
            border-radius: 10px;
            overflow: hidden;
            box-shadow: 0 0 40px rgba(8, 7, 16, 0.6);
        }

        th, td {
            padding: 15px;
            text-align: left;
            border-bottom: 1px solid rgba(255, 255, 255, 0.1);
        }

        th {
            background-color: rgba(255, 255, 255, 0.07);
            color: white;
            font-weight: 500;
            text-transform: uppercase;
            font-size: 14px;
            letter-spacing: 1px;
        }

        tr:last-child td {
            border-bottom: none;
        }

        tr:nth-child(even) {
            background-color: rgba(255, 255, 255, 0.05);
        }

        tr:hover {
            background-color: rgba(255, 255, 255, 0.1);
        }

        a {
            color: white;
            text-decoration: none;
        }

        a:hover {
            text-decoration: underline;
        }
        td{
            color: white;
        }

    </style>
<body class="container">
    <div class="background">
    	<div class="shape"></div>
        <div class="shape"></div>
    </div>
    <div class="table-responsive">
        <table class="table table-striped">
            <tr>
                <th>Pirmas skaičius</th>
                <th>Ženklas</th>
                <th>Antras skaičius</th>
                <th>Rezultatas</th>
                <th>Veiksmas</th>
            </tr>

            <c:forEach var="skaicius" items="${skaiciai}">

                <c:url var="atnaujinti" value="/atnaujinti">
                    <c:param name="id" value="${skaicius.id}"/>
                </c:url>

                <c:url var="trinti" value="/trinti">
                    <c:param name="id" value="${skaicius.id}"/>
                </c:url>

                <c:url var="rodyti" value="/rodyti">
                    <c:param name="id" value="${skaicius.id}"/>
                </c:url>

                <tr>
                    <td>${skaicius.num1}</td>
                    <td>${skaicius.operation}</td>
                    <td>${skaicius.num2}</td>
                    <td>${skaicius.result}</td>

                    <td>
                        <sec:authorize access="hasAnyAuthority('ROLE_ADMIN')">
                            <a href="${atnaujinti}">Keisti</a>
                            |
                            <a href="${trinti}" onclick="return confirm('Ar tikrai norite ištrinti šį įrašą?')">Trinti</a>
                            |
                        </sec:authorize>
                        <a href="${rodyti}">Rodyti</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</body>
</html>
