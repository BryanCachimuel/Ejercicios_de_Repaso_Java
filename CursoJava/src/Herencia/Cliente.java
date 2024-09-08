package Herencia;

import java.util.Date;

public class Cliente extends Persona{
    private int idCliente;
    private Date fechaRegistro;
    private boolean vip;
    private static int contadorCliente;
    
    public Cliente(String nombre, char genero, int edad, String direccion, Date fechaRegistro, boolean vip){
        super(nombre, genero, edad, direccion);
        this.idCliente = ++contadorCliente;
        this.fechaRegistro = fechaRegistro;
        this.vip = vip;
    }
    
    public int getIdCliente(){
        return this.idCliente;
    }
    
    public Date getFechaRegistro(){
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
    
    public boolean isVip(){
        return this.vip;
    }
    
    public void setVip(boolean vip){
        this.vip = vip;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{idCliente=").append(idCliente);
        sb.append(", nombre=").append(nombre);
        sb.append(", genero=").append(genero);
        sb.append(", edad=").append(edad);
        sb.append(", dirección=").append(direccion);
        sb.append(", fechaRegistro=").append(fechaRegistro);
        sb.append(", vip=").append(vip);
        sb.append('}');
        return sb.toString();
    }
    
    
}
