package com.ec.proyecto.persistencia;

import com.ec.proyecto.logica.Automovil;
import com.ec.proyecto.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Bryan
 */
public class ControladorPersistencia {
    
    AutomovilJpaController autoJPA = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJPA.create(auto);
    }

    public List<Automovil> listarAutos() {
        return autoJPA.findAutomovilEntities();
    }

    public void eliminarAuto(int idAuto) {
        try {
            autoJPA.destroy(idAuto);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladorPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
