/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.ecu.ups.clases;

import ec.ecu.ups.interfaces.Acciones;

/**
 *
 * @author Usuario
 */
public class Pez extends Animal implements Acciones{

    public Pez(String nombre, int edad, double peso, String sexo) {
        super(nombre, edad, peso, sexo);
    }

    @Override
    public void comer() {
        
    }

    @Override
    public void dormir() {
        
    }

    @Override
    public void moverse() {
        
    }

    @Override
    public void jugar() {
        
    }

    @Override
    public void reproducirse() {
        
    }
    
}
