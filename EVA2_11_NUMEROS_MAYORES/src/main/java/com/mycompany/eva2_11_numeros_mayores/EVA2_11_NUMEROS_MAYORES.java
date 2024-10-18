/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_11_numeros_mayores;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_11_NUMEROS_MAYORES {

    public static void main(String[] args) {
        int num ,num2=0;
        
        Scanner cap = new Scanner(System.in);
        
        
        while(true){
            System.out.println("diga un numero");
            num=cap.nextInt();
            if(num>num2){
                num2=num;
                 }
            if (num<0){
                break;
            } 
           
        }
        System.out.println("el numero mayor es:" + num2);
        
        
    }
}