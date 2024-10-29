<%@page errorPage="/WEB-INF/manejoErrores.jsp"%>
<%@page import="utilerias.Conversiones, java.util.Date"%>
<%@page contentType="application/vnd.ms-excel" %>
<%
    String nameArchivo = "reporte.xls";
    /*
    Para descargar el archivo excel
    response.setHeader("Content-Disposition", "attachment;filename=" + nameArchivo);
    */
    /*inline -> permite redirigir a un archivo en caso de error*/
     response.setHeader("Content-Disposition", "inline;filename=" + nameArchivo);
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
                <th>Descripci�n</th>
                <th>Fecha</th>
            </tr>
            <tr>
                <td>1. Fundamentos de Java</td>
                <td>Aprenderemos la sintaxis b�sica de java</td>
                <td>
                    <%= Conversiones.format(new Date()) %>
                </td>
            </tr>
            <tr>
                <td>2. Programaci�n con Java</td>
                <td>Pondremos en pr�ctica conceptos de la programaci�n orientada a objetos</td>
                <td>
                    <%= Conversiones.format(new Date()) %>
                </td>
            </tr>
            <tr>
                <td>3. Programaci�n Web con JavaEE</td>
                <td>Proceso introductorio a Java Web con Java Enterprise Edition</td>
                <td>
                    <%= Conversiones.format("500") %>
                </td>
            </tr>
        </table>
    </body>
</html>