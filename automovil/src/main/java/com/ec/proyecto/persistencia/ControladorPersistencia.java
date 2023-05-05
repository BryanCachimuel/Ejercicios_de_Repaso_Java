package com.ec.proyecto.persistencia;

import com.ec.proyecto.logica.Automovil;

/**
 *
 * @author Bryan
 */
public class ControladorPersistencia {
    
    AutomovilJpaController autoJPA = new AutomovilJpaController();

    public void agregarAutomovil(Automovil auto) {
        autoJPA.create(auto);
    }
    
}
