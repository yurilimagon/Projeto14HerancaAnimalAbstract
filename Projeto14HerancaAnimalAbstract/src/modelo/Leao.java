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
public class Leao extends Felino {
    //ATRIBUTO
    private String origem;
    
    //CONSTRUTORES
    //VAZIO
    public Leao() {
    }
    
    //CHEIO
    public Leao(String origem, String comida, String habitat) {
        super(comida, habitat);
        this.origem = origem;
    }

    //GETTER E SETTER

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    @Override
    public void makeNoise() {
        System.out.println("Rugido");
    }
    
    @Override
    public void movimentar(){
        System.out.println("Caminhar Leão");
    }
}
