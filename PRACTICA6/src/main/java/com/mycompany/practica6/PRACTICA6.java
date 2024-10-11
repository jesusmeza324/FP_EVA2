/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica6;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class PRACTICA6 {

    public static void main(String[] args) {
   int num;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite su numero");
        num=cap.nextInt();
         String acum="";
             
        for (int i = 1; i <= num; i++) {
             
             acum=acum + "*";
             System.out.println(acum);
        }
        for (int i = num; i > 0; i--) {
            String acum2="";
            for (int j = 1; j <= i; j++) {
                acum2=acum2+"*";
               
                
            }System.out.println(acum2);
            
        }
        
   
        
    }
}