package com.ec.proyecto.logica;

import com.ec.proyecto.persistencia.ControladorPersistencia;
import java.util.List;

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

    public List<Automovil> listarAutos() {
        return controlPersistencia.listarAutos();
    }

    public void eliminarAuto(int idAuto) {
        controlPersistencia.eliminarAuto(idAuto);
    }

    public Automovil traerAutomovil(int idAuto) {
        return controlPersistencia.traerAutomoviles(idAuto);
    }
    
}
