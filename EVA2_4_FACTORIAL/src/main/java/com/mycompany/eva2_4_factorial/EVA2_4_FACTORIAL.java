/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_4_factorial;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_4_FACTORIAL {

    public static void main(String[] args) {
       double num ,resu=1;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite el numero;");
        num=cap.nextInt();
        
        for (int i = 1; i<=num; i++) {
            resu=resu*i;
           
        }
        System.out.println("el resultado es=" + resu);
    }
}
