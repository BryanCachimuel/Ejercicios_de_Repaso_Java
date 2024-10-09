package datos;

import domain.PersonaDTO;
import java.sql.*;
import java.util.*;

public class PersonaDaoJDBC implements PersonaDAO{

    private Connection conexionTransaccional;

    private static final String SQL_SELECT = "SELECT id_persona, nombre,apellido, email, telefono FROM persona";
    private static final String SQL_INSERT = "INSERT INTO persona(nombre, apellido, email, telefono) VALUES(?, ?, ?, ?)";
    private static final String SQL_UPDATE = "UPDATE persona SET nombre=?, apellido=?, email=?, telefono=? WHERE id_persona=?";
    private static final String SQL_DELETE = "DELETE FROM persona WHERE id_persona = ?";

    public PersonaDaoJDBC() {
    }

    public PersonaDaoJDBC(Connection conexionTransaccional) {
        this.conexionTransaccional = conexionTransaccional;
    }

    @Override
    public List<PersonaDTO> select() throws SQLException {
        Connection conn = null;
        PreparedStatement psmtm = null;
        ResultSet rs = null;
        PersonaDTO persona;
        List<PersonaDTO> personas = new ArrayList<>();

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            psmtm = conn.prepareStatement(SQL_SELECT);
            rs = psmtm.executeQuery();
            while (rs.next()) {
                int idPersona = rs.getInt("id_persona");
                String nombre = rs.getString("nombre");
                String apellido = rs.getString("apellido");
                String email = rs.getString("email");
                String telefono = rs.getString("telefono");

                // se usa el constructor con toda la información para agregar una persona
                persona = new PersonaDTO(idPersona, nombre, apellido, email, telefono);
                personas.add(persona);
            }
        } finally {
            try {
                Conexion.close(rs);
                Conexion.close(psmtm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return personas;
    }

    @Override
    public int insert(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement psmtm = null;
        int registros = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            psmtm = conn.prepareStatement(SQL_INSERT);
            psmtm.setString(1, persona.getNombre());
            psmtm.setString(2, persona.getApellido());
            psmtm.setString(3, persona.getEmail());
            psmtm.setString(4, persona.getTelefono());
            // se hace este procedimiento por que estamos alterando la base de datos y un executeUpdate puede facilitar el procedimiento de inserción
            registros = psmtm.executeUpdate();
        } finally {
            try {
                Conexion.close(psmtm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }

        }
        return registros;
    }

    @Override
    public int update(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement psmtm = null;
        int registroActualizado = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            psmtm = conn.prepareStatement(SQL_UPDATE);
            psmtm.setString(1, persona.getNombre());
            psmtm.setString(2, persona.getApellido());
            psmtm.setString(3, persona.getEmail());
            psmtm.setString(4, persona.getTelefono());
            psmtm.setInt(5, persona.getIdPersona());
            registroActualizado = psmtm.executeUpdate();

        } finally {
            try {
                Conexion.close(psmtm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }

        return registroActualizado;
    }

    @Override
    public int delete(PersonaDTO persona) throws SQLException {
        Connection conn = null;
        PreparedStatement psmtm = null;
        int registroEliminar = 0;

        try {
            conn = this.conexionTransaccional != null ? this.conexionTransaccional : Conexion.getConnection();
            psmtm = conn.prepareStatement(SQL_DELETE);
            psmtm.setInt(1, persona.getIdPersona());
            registroEliminar = psmtm.executeUpdate();
        } finally {
            try {
                Conexion.close(psmtm);
                if (this.conexionTransaccional == null) {
                    Conexion.close(conn);
                }
            } catch (SQLException ex) {
                ex.printStackTrace(System.out);
            }
        }
        return registroEliminar;
    }
}
