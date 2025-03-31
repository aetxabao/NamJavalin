<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Medias</title>
    <link rel="icon" type="image/x-icon" href="/imgs/icons/favicon.ico">
    <link rel="stylesheet" href="/css/style.css">
    <link rel="stylesheet" href="/css/table.css">
</head>
<body>
<div class="main-container">
    <h1>Medias</h1>
    <table>
        <thead>
        <tr>
            <th class="wp10">A.</th>
            <th class="wp10">Id.</th>
            <th class="wp30">Nombre</th>
            <th class="wp40">Apellidos</th>
            <th class="wp10">Media</th>
        </tr>
        </thead>
        <tbody>
        <#list alumnado as alum>
            <#if alum.aprobado == true>
                <tr class="bg-yellow">
            <#else>
                <tr class="bg-orange">
            </#if>
                <td>
                <#--
                <td>${alum.aprobado?string("A", "S")}</td>
                -->
                <#if alum.aprobado == true>
                    <img src="/imgs/icons/accept.png" class="icon-sm" alt="ok"/>
                <#else>
                    <img src="/imgs/icons/cancel.png" class="icon-sm" alt="ok"/>
                </#if>
                </td>
                <td>${alum.id}</td>
                <td>${alum.nombre}</td>
                <td>${alum.apellidos}</td>
                <td>${alum.notaMedia}</td>
            </tr>
        </#list>
        </tbody>
    </table>
    <#include "footer.ftl">
</div>
</body>
</html>