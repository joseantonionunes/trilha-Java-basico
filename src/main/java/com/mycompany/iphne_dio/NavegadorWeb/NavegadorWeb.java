/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iphne_dio.NavegadorWeb;

/**
 *
 * @author josea
 */
public class NavegadorWeb implements Navegador {
    
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
}
