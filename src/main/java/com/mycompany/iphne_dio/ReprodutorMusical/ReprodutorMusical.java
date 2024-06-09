/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iphne_dio.ReprodutorMusical;

/**
 *
 * @author josea
 */
public class ReprodutorMusical implements Musica{

    @Override
     public void tocar(){
        System.out.println("Tocando Musica");
    }
    
     @Override
    public void pausar(){
        System.out.println("Pausando Musica");
    }
    
     @Override
    public void selecionarMusica(){
        System.out.println("Selecionado Musica");
    }
    
}
