<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Resultados</title>
    <link rel="icon" type="image/x-icon" href="/imgs/icons/favicon.ico">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div class="main-container">
    <h1>Resultados</h1>

    <#list alumnado as amn>
    <h2>${amn.nombre} ${amn.apellidos}</h2>
    <table>
        <thead>
        <tr>
            <th class="wp20">Id.</th>
            <th class="wp70">Módulo</th>
            <th class="wp10">Nota</th>
        </tr>
        </thead>
        <tbody>
        <#list amn.modulosNotas as mn>
            <tr>
                <td>${mn.id}</td>
                <td>${mn.nombre}</td>
                <td>${mn.nota}</td>
            </tr>
        </#list>
        </tbody>
    </table>
    </#list>

    <#include "footer.ftl">
</div>
</body>
</html>