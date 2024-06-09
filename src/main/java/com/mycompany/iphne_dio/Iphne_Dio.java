/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iphne_dio;

import com.mycompany.iphne_dio.ReprodutorMusical.Musica;
import com.mycompany.iphne_dio.Telefonico.AparelhoTelefonico;
import com.mycompany.iphne_dio.aparelho.Smartfone;

/**
 *
 * @author josea
 */
public class Iphne_Dio {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        AparelhoTelefonico tel = new AparelhoTelefonico();
        
        tel.IniciarCorreioVoz();
        
        Smartfone iphone = new Smartfone();
        Musica mu = new Smartfone();
        
        iphone.atender();
        mu.pausar();
        
    }
}
