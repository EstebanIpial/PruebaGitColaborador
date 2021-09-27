/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Usuario
 */
public class Multa {
    private Persona persona;
    private float valorMulta;

    public Multa(Persona persona, float valorMulta) {
        this.persona = persona;
        this.valorMulta = valorMulta;
    }

    public Persona getPersona() {
        return persona;
    }

    public float getValorMulta() {
        return valorMulta;
    }
    
    
    
    
}
