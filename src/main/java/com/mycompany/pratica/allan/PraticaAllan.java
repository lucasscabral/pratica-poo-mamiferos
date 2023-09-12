/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pratica.allan;

/**
 *
 * @author user
 */
public class PraticaAllan {

    public static void main(String[] args) {
        //Cão
        System.out.println("/--------------Características da Cão---------------/");
        Cao cao = new Cao();
        
        cao.setNome("Juca");
        cao.setCor("Caramelo");
        cao.setRaca("vira-lata");
        
        System.out.println("Nome do cão: " + cao.getNome());        
        System.out.println("Cor do cão: " + cao.getCor());
        System.out.println("Raça do cão: " + cao.getRaca());
        
        cao.correr();  
        cao.sentar();
        
        //Baleia
        System.out.println("/--------------Características da Baleia---------------/"); 
        Baleia baleia = new Baleia();
        
        baleia.setNome("Flor");
        baleia.setPeso(400.50);
        baleia.setRaca("Baleia-azul");
        
        System.out.println("Nome da baleia: " + baleia.getNome());        
        System.out.println("Peso da baleia: " + baleia.getPeso());
        System.out.println("Raça da baleia: " + baleia.getRaca());
        
        baleia.nadar();
        baleia.comerCrustaceos();
    }
}
