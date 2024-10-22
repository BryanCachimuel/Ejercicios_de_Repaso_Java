<%@page import="utilerias.Conversiones, java.util.Date"%>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nameArchivo = "reporte.xls";
    response.setHeader("Content-Disposition", "attachment;filename=" + nameArchivo);
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reporte Excel</title>
    </head>
    <body>
        <h1>Reporte Excel</h1>
        <br/>
        <table border="1">
            <tr>
                <th>Curso</th>
                <th>Descripción</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis básica de java</td>
                <td>
                    <%= Conversiones.format(new Date()) %>
                </td>
            </tr>
            <tr>
                <td>2. Programación con Java</td>
                <td>Pondremos en práctica conceptos de la programación orientada a objetos</td>
                <td>
                    <%= Conversiones.format(new Date()) %>
                </td>
            </tr>
        </table>
    </body>
</html>
