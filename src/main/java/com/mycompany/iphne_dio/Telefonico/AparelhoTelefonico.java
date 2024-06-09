/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iphne_dio.Telefonico;

/**
 *
 * @author josea
 */
public class AparelhoTelefonico implements Telefonico {
    
    @Override
    public void ligar(){
        System.out.println("LIgando");
    }
    
     @Override
    public void atender(){
        System.out.println("Atendendo");
    }
    
     @Override
    public void IniciarCorreioVoz(){
        System.out.println("Iniciar Correio de Voz");
    }
}
