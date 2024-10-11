/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practica2;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class PRACTICA2 {

    public static void main(String[] args) {
  int num1, num2;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite el primer numero");
        num1=cap.nextInt();
        System.out.println("digite el segundo numero");
        num2=cap.nextInt();
        System.out.println("ascendentes");
        for (int i = num1; i <=num2; i++ ) {
            System.out.println(i);
        }System.out.println("descendentes");
        for (int i = num2; i >= num1; i--) {
            System.out.println(i);
        }
    }
}
