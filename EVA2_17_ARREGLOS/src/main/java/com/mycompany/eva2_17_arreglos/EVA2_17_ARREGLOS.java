/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_17_arreglos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_17_ARREGLOS {

    public static void main(String[] args) {
        int califas;
        int califas2[];
        String nombres[];
        Scanner cap = new Scanner(System.in);
        System.out.println("¿cuantas calificaciones quieres capturar?");
        califas=cap.nextInt();
        cap.nextLine();
        califas2= new int[califas];
        nombres=new String[califas];
        
        for (int i = 0; i < califas2.length; i++) {
            System.out.println("nombre estudiantes #"+ i);
            nombres[i]=cap.nextLine();
            
            System.out.println("calificacion estudiantes #"+ i);
            califas2[i]=cap.nextInt();
            cap.nextLine();
            
        }
         for (int i = 0; i < califas2.length; i++) {
             
             System.out.print(nombres[i] + ";"+ califas2[i] + "-");
            
        }
        
        
    }
}
