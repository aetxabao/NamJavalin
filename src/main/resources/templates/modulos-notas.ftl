<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Estadísticas</title>
    <link rel="icon" type="image/x-icon" href="/imgs/icons/favicon.ico">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div class="main-container">
    <h1>Estadísticas</h1>
    <table>
        <thead>
        <tr>
            <th>Id.</th>
            <#assign primerasNotas = mapa?values?first>
            <#assign tamNotas = primerasNotas?size>
            <#list 1..tamNotas as i>
                <th class="wp10">${i}</th>
            </#list>
        </thead>
        <tbody>
        <#list mapa as modulo, notas>
            <tr>
                <th>${modulo}</th>
                <#list notas as nota>
                    <td class="txt-center">${nota}</td>
                </#list>
            </tr>
        </#list>
        </tbody>
    </table>
    <#include "footer.ftl">
</div>
</body>
</html>