package test;

import datos.Conexion;
import datos.UsuarioDAO;
import domain.Usuario;
import java.sql.*;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestTransaccional {

    public static void main(String[] args) {

        Connection conexion = null;

        try {
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            UsuarioDAO usuarioDao = new UsuarioDAO(conexion);
            Usuario actualizarUsuario = new Usuario(9, "Joseph", "8974563");

            usuarioDao.actualizar(actualizarUsuario);

            /*Usuario nuevoUsuario = new Usuario("Franklin", "907456983");
            usuarioDao.insertar(nuevoUsuario);*/

            List<Usuario> usuarios = usuarioDao.listarUsuarios();

            usuarios.forEach(usuario -> {
                System.out.println("Usuarios: " + usuario);
            });

            conexion.commit();
            System.out.println("Se ha hecho el commit de la transacción");

        } catch (SQLException ex) {
            try {
                ex.printStackTrace(System.out);
                System.out.println("Entramos al rollback");
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
    }

}
