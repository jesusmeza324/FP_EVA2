/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_9_pwd;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_9_PWD {

    public static void main(String[] args) {
        final String admin="ADMIN";
        final String psw="CONTRASEÑA";
        String usuario, contraseña;
        Scanner cap= new Scanner(System.in);
     
        do{
           
        System.out.println("Inserte el usuario");
        usuario = cap.nextLine();
        System.out.println("digite sus contraseña");
        contraseña = cap.nextLine();
            
        }while(!(usuario.equals(admin) && contraseña.equals(psw)));{
        System.out.println("acesso");//not---->!
    }
    }
}
