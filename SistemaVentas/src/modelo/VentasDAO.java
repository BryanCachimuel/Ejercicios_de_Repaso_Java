package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Bryan
 */
public class VentasDAO {
    Conexion cn = new Conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    
    int respuesta = 0;
    
    public String IdVentas(){
        String idv = "";
        String sql = "SELECT * FROM ventas";
        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               idv = rs.getString(1);
            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error durante el proceso de la consulta");
        }
        return idv;
    }
    
}
