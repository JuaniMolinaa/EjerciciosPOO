/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2eggpoo;

import guia2eggpoo.entidades.Persona;

/**
 *
 * @author usuario
 */
public class PruebasIntegrador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona p1 = new Persona();
        String nombre = null;
        
        try{
            if(!nombre.equals(null)){
                p1.setNombre(nombre);
            }
        } catch (Exception e){
            System.out.println("El nombre no puede ser nulo");
        }

    }

}
