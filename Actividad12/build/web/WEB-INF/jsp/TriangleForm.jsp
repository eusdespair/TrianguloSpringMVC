<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora Triangulo</title>
    </head>
    <body>
        <h2>Calculadora Triangulo</h2>
        <form action="${pageContext.request.contextPath}/calculo" method="post">
            <label for="lado"> Largo del lado:</label>
            <input type="text" id="lado" name="lado">
            <input type="submit" value="Calcular Area y Perimetro">
        </form>
    </body>
</html>
