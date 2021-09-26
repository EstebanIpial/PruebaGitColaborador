/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteb
 */
public class Persona {
    private long identificacion;
    private String nombre;
    private String apellido;

    public Persona(long identificacion, String nombre, String apellido) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }
    
    
    
    
}
