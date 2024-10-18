/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_10_validar2;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_10_VALIDAR2 {

    public static void main(String[] args) {
        int dia;
        Scanner cap=new Scanner(System.in);
        while(true){
             System.out.println("numero correspondiente al dia(1-7)");
        dia = cap.nextInt();
            if(dia>=1 && dia<=7){
                switch(dia){
            case 1:
                System.out.println("lunes");
                break;//ultima instruccion 
                case 2:
                System.out.println("martes");
                break;
                case 3:
                System.out.println("miercoles");
                break;
                case 4:
                System.out.println("jueves");
                break;
                case 5:
                System.out.println("viernes");
                break;
                case 6:
                System.out.println("sabado");
                break;
                case 7:
                System.out.println("domingo");
                break;
                }
            
                break;
        
         
                 
            }
        
        }
    
    }
}
