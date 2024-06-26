<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Skaičiuotuvas</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    <style>
        /* Add Poppins font */
        .calculator-header {
            font-family: 'Poppins', sans-serif;
        }

        .calculator-header .navbar {
            margin-bottom: 0;
            display: flex;
            align-items: center;
            justify-content: space-between;
            background-color: rgba(255,255,255,0.13);
            border-bottom-left-radius: 10px;
            border-bottom-right-radius: 10px;
            backdrop-filter: blur(10px);
            border-bottom: 2px solid rgba(255,255,255,0.1);
            box-shadow: 0 0 40px rgba(8,7,16,0.6);
            height: 100px;
        }

        .calculator-header .navbar-brand,
        .calculator-header .navbar-nav > li > a {
            color: white;
            text-decoration: none;
            font-size: 20px;
            font-weight: bold;
        }

        .calculator-header .navbar-brand:hover,
        .calculator-header .navbar-nav > li > a:hover {
            color: white;
        }

        .calculator-header .user-role span {
            font-weight: bold;
        }

        .calculator-header .user-role .user {
            color: green;
        }

        .calculator-header .atliktos {
            margin-right: 60vw;
        }
    </style>
</head>
<body class="calculator-header">
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <a class="navbar-brand" href="/calculator">Skaičiuotuvas</a>
        <ul class="nav navbar-nav">
            <li class="active atliktos"><a href="/skaiciai">Atliktos operacijos</a></li>
        </ul>
        <ul class="nav navbar-nav navbar-right user-role">
            <li><a style="font-size: 15px; color: white;">Vartotojas: <span class="user">${pageContext.request.userPrincipal.name}</span></a></li>
            <li style="margin-left: auto;"><a style="font-size: 15px; background-color: red; padding: 4px 5px; border-radius: 10px;" href="${pageContext.request.contextPath}/logout">Atsijungti</a></li>
        </ul>
    </div>
</nav>
</body>
</html>
