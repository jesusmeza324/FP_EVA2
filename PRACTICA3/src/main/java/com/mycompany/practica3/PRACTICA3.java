/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica3;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class PRACTICA3 {

    public static void main(String[] args) {
        String cade;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite la cadena de texto");
        cade=cap.nextLine();
        for (int i = 0; i < cade.length(); i++) {
            char letra=cade.charAt(i);
            if(letra=='a'|| letra=='e' || letra=='i' || letra=='o' || letra=='u' )
                System.out.println(letra);
            
        }
    }
}
