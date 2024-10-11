/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class PRACTICA1 {

    public static void main(String[] args) {
   int num;
        String text;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite su cadena de texto:");
        text=cap.nextLine();
        System.out.println("numero de veces que quiere repetirla");
        num=cap.nextInt();
        
        for (int i = 1; i <= num; i++) {
            System.out.println(text);
        }
    }
}
