<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<html>
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
        h3{
            font-size: 32px;
            font-weight: 500;
            line-height: 42px;
            text-align: center;
        }

    </style>
    </head>
    <body class="container">
        <div class="background">
        	<div class="shape"></div>
            <div class="shape"></div>
        </div>
        <div class="table-responsive">
            <h3>Skaičiaus informacija</h3>
            <table class="table table-striped">
                <tr>
                    <td><b>Id:</b></td>
                    <td>${skaicius.id}</td>
                </tr>
                <tr>
                    <td><b>Pirmas skaičius: </b></td>
                    <td>${skaicius.num1}</td>
                </tr>
                <tr>
                    <td><b>ženklas:</b></td>
                    <td>${skaicius.operation}</td>
                </tr>
                <tr>
                    <td><b>Antras skaičius:</b></td>
                    <td>${skaicius.num2}</td>
                </tr>
                <tr>
                    <td><b>Rezultatas: </b></td>
                    <td>${skaicius.result}</td>
                </tr>
            </table>
        </div>
        <br>
        <a type="button" href="/skaiciai" class="button">Atgal</a>
    </body>
</html>
