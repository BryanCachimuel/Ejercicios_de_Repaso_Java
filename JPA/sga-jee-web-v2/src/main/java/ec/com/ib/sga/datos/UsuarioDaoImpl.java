package ec.com.ib.sga.datos;

import ec.com.ib.sga.domain.Usuario;
import java.util.List;
import javax.persistence.*;

/*
    Esta clase debe ser un EJB para que pueda injectarse el EntityManager de JPA el persistence-util
*/

public class UsuarioDaoImpl implements UsuarioDao{
    
    // Inyectando la unidad de persistencia
    // Inyectar la unidad de persistencia mediante el api de JPA
    @PersistenceContext(unitName="UsuarioPU")
    EntityManager em;

    @Override
    public List<Usuario> findAllUsuario() {
        return em.createNamedQuery("Usuario.findAll").getResultList();
    }

    @Override
    public Usuario findUsuarioById(Usuario usuario) {
        return em.find(Usuario.class, usuario.getIdUsuario());
    }

    @Override
    public Usuario findUsuarioByUsername(Usuario usuario) {
        Query query = em.createQuery("from Usuario u where u.username =: username");
        query.setParameter("username", usuario.getUsername());
        return (Usuario) query.getSingleResult();
    }

    @Override
    public void insertUsuario(Usuario usuario) {
        em.persist(usuario);
    }

    @Override
    public void updateUsuario(Usuario usuario) {
        em.merge(usuario);
    }

    @Override
    public void deleteUsuario(Usuario usuario) {
       em.remove(em.merge(usuario));
    }
    
}
