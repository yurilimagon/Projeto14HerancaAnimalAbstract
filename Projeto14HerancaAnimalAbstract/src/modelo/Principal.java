/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author yuril
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Animal a1 = new Animal();
        //a1.makeNoise();
        //Felino f1= new Felino();
        //f1.makeNoise();
        //Canino c1 = new Canino();
        //c1.makeNoise();
        Siames siames1 = new Siames();
        siames1.makeNoise();
        siames1.movimentar();
    }
    
}
