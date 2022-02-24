package com.mycompany.horadosistema;

import java.util.Date;

//Programa para mostrar data e hora atuais do sistema
public class HoraDoSistema {
    public static void main(String[] args){
        Date relogio = new Date();
        System.out.println("A hora do sistema é");
        System.out.println(relogio.toString());
    }
}
