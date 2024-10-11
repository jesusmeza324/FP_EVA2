/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class PRACTICA4 {

    public static void main(String[] args) {
    String cade;
        
        Scanner cap = new Scanner(System.in);
        System.out.println("digite su cadena");
        cade=cap.nextLine();
        
        for (int i = 0; i < cade.length(); i++) {
            
            System.out.println(cade.charAt(i));
        }
    }
} 