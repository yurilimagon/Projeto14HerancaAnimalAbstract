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
public class Gato extends Felino {
    //ATRIBUTOS
    private String raca;
    
    //CONSTRUTORES

    public Gato() {
    }

    public Gato(String raca, String comida, String habitat) {
        super(comida, habitat);
        this.raca = raca;
    }
    
    //GETTER E SETTERS
    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Miado");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Gato");
    }
}
