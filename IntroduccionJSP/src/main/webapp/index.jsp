<%-- Agregamos una declaraci�n de JSP --%>
<%!
    // Declaramos una variable con su m�todo Get
    private String usuario = "BLCL";
    
    public String getUsuario(){
        return this.usuario;
    }

    // Declaramos un contador de visitas
    private int contadorVisitas = 1;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Uso de Declaraciones con JSP</title>
    </head>
    <body>
        <h1>Uso de Declaraciones con JSP</h1>
        Valor usuario por medio del atributo: <%= this.usuario %>
        <br/>
        Valor de usuario por medio del m�todo: <%= this.getUsuario() %>
        <br/>
        Contador de Visitas: <%= this.contadorVisitas++ %>
    </body>
</html>
