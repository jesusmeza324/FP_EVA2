/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_2_promedio;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_2_PROMEDIO {

    public static void main(String[] args) {
        Scanner cap = new Scanner(System.in);
        int califa, sumaCalif;
        double prom;
        //iniciar el acumulador
        sumaCalif =0;
        prom=sumaCalif/10;
        for (int i = 1; i <= 10; i++) {
            System.out.println("estudiante = " + i);
            System.out.println("cual es su califiacion?");
        califa =cap.nextInt();
        cap.nextLine();
        //acumular las calificaciones
        sumaCalif = sumaCalif+ califa;
        prom=sumaCalif/10.0; 
        }
        
        System.out.println("sumacalifa="+ sumaCalif);//sumatoria
        System.out.println("promedio="+ prom);
        
        
        
        
    }
}
