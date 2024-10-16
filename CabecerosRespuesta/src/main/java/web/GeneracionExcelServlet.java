package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/GeneracionExcelServlet")
public class GeneracionExcelServlet extends HttpServlet{
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        // definiendo el cabecero de respuesta para el navegador
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename=excelEjemplo.xls");
        
        // cabeceros para que no se guarde información en el cache
        response.setHeader("Pragma", "no-cache");
        response.setHeader("Cache-control", "no-store");
        response.setDateHeader("Expires", -1); // para que se genere siempre información nueva
        
        // desplegar la información al cliente
        PrintWriter out = response.getWriter();
        out.print("\tValores");
        out.print("\t1");
        out.print("\t2");
        out.print("Total\t=SUMA(b2:b3)");
        out.close();
    }
}
