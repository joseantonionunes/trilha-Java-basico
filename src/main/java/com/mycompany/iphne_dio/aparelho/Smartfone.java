/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.iphne_dio.aparelho;

import com.mycompany.iphne_dio.NavegadorWeb.Navegador;
import com.mycompany.iphne_dio.ReprodutorMusical.Musica;
import com.mycompany.iphne_dio.Telefonico.Telefonico;

/**
 *
 * @author josea
 */
public class Smartfone implements Musica,Navegador,Telefonico{

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
    
     @Override
    public void exibirPagina(){
        System.out.println("Exibir Pagina");
    }
    
     @Override
    public void adicionarNovaAba(){
        System.out.println("adicionar Nova Aba");
    }
    
     @Override
    public void atualizarPagina(){
        System.out.println("atualizar Pagina");
    }
    
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
