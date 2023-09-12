/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica.allan;

/**
 *
 * @author user
 */
public class Baleia extends Mamifero{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void nadar() {
        System.out.println("O(A)"+nome+" esta nadando!");
    }
    
    public void comerCrustaceos(){
        System.out.println("O(A)"+nome+" esta comendo crustáceos!");
    }
}
