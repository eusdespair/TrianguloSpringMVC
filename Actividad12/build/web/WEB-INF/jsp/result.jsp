<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h2>Resultado</h2>
        <p>Area:${area}</p>
        <p>Perimetro:${perimetro}</p>
        <a href="${pageContext.request.contextPath}/">Regresar</a>
    </body>
</html>
