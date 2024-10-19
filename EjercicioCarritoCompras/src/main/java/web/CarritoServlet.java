package web;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


@WebServlet("/CarritoServlet")
public class CarritoServlet extends HttpServlet{
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response){
        response.setContentType("text/html;charset=UTF-8");
    }
}
