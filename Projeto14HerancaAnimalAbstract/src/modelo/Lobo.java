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
public class Lobo extends Canino {
    //ATRIBUTO
    private double peso;
    
    //CONSTRUTORES
    //VAZIO
    public Lobo() {
    }
    //CHEIO
    public Lobo(double peso, String comida, String habitat) {
        super(comida, habitat);
        this.peso = peso;
    }
    //GETTER E SETTER
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Uivo");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Lobo");
    }
}
