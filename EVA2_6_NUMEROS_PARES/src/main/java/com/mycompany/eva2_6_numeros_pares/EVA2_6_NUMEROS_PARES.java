/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_6_numeros_pares;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_6_NUMEROS_PARES {

    public static void main(String[] args) {
       int num, num1;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite el primer numero;");
        num=cap.nextInt();
         System.out.println("digite el segundo numero;");
        num1=cap.nextInt();
        for (int i = num; i <= num1; i++) {
            int modulo=i%2;
            if(modulo!=0)//sea impar para detener la impresion
                continue;
            System.out.print(i + "-");
        }System.out.println("");
        for (int i = num; i <= num1; i++) {
            int modulo=i%2;
            if(modulo==0)//sea impar para detener la impresion
                continue;
            System.out.print(i + "-");
        }
    }
}
