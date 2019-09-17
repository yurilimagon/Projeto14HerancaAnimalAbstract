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


//CLASSE É ABSTRATA QUANDO QUEREMOS IMPEDIR QUE
//UM OBJETO SEJA INSTANCIADO DESSA CLASSE
//PARA ISSO USAREI A PALAVRA RESERVADA abstract NA
//DECLARAÇÃO DA CLASSE
public abstract class Animal {
    
    //ATRIBUTOS
    protected String comida;
    protected String habitat;
    
    //CONSTRUTORES
    //VAZIO
    public Animal() {
    }
    //CHEIO
    public Animal(String comida, String habitat) {
        this.comida = comida;
        this.habitat = habitat;
    }
    
    //GETTERS E SETTERS
    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    //MÉTODO makeNoise() PASSOU A SER UM MÉTODO
    //ABSTRATO E PORTANTO NÃO TENHO MAIS A IMPLEMENTAÇÃO
    //{CORPO} DO MÉTODO
    //TODO MÉTODO ABSTRATO OBRIGATÓRIAMENTE DEVE SER
    //IMPLEMENTADO NAS CLASSES FILHO (CONCRETAS)
    //PARA DEFINIR UM MÉTODO ABSTRATO DEVEREMOS COLOCAR
    //A PALAVRA RESERVADA 'ABSTRACT' NA ASSINATURA DO
    //MÉTODO E COLOCAR UM PONTO E VÍRGULA EM VEZ DE ABRE E FECHA
    //AS CHAVES DO CORPO DO MÉTODO
    public abstract void makeNoise();
    
    public abstract void movimentar();
}
