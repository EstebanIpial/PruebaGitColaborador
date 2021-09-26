/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author esteb
 */
public class Agente extends Persona{
    private long codigo;

    public Agente(long codigo, long identificacion, String nombre, String apellido) {
        super(identificacion, nombre, apellido);
        this.codigo = codigo;
    }

    public long getCodigo() {
        return codigo;
    }
    
    
    
}
