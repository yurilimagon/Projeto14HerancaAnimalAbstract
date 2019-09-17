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
public class Cao extends Canino {
    //ATRIBUTO
    private double tamanho;
    
    //CONSTRUTORES
    //VAZIO
    public Cao() {
    }
    //CHEIO
    public Cao(double tamanho, String comida, String habitat) {
        super(comida, habitat);
        this.tamanho = tamanho;
    }
    
    //GETTER E SETTTER
    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public void makeNoise() {
        System.out.println("Latido");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Cão");
    }
}
