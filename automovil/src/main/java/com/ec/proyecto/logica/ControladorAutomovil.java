package com.ec.proyecto.logica;

import com.ec.proyecto.persistencia.ControladorPersistencia;

/**
 *
 * @author Bryan
 */
public class ControladorAutomovil {
    
    ControladorPersistencia controlPersistencia = new ControladorPersistencia();
    
    public void agregarAutomovil(String modelo, String marca, String motor, String color, String placa, int cantidadPuertas, double valorAutomovil) {
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPlaca(placa);
        auto.setCantidadPuertas(cantidadPuertas);
        auto.setValorAutomovil(valorAutomovil);
        controlPersistencia.agregarAutomovil(auto);
    }
    
}
