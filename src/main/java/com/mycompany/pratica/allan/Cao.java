/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pratica.allan;

/**
 *
 * @author user
 */
public class Cao extends Mamifero {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void correr(){
        System.out.println("O(A)"+nome+" esta correndo!");
    }
    public void andar(){
        System.out.println("O(A)"+nome+" esta andando!");
    }
    public void sentar(){
        System.out.println("O(A)"+nome+" esta descansando!"); 
    }
}
