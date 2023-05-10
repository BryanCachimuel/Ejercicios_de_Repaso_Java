package com.ec.proyecto.persistencia;

import com.ec.proyecto.logica.Automovil;
import java.util.List;

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
    
}
