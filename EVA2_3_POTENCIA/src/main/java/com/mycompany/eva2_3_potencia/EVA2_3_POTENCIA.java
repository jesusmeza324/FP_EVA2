/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_3_potencia;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_3_POTENCIA {

    public static void main(String[] args) {
        int num ,pot;
        Scanner cap = new Scanner(System.in);
        System.out.println("digite el numero base");
        num=cap.nextInt();
        System.out.println("digite la potencia");
        pot=cap.nextInt();
        int resu=1;
        for (int i = 1; i <=pot; i++) {
            resu=resu * num;
            
        }
        System.out.println("el resultado es=" + resu);
    }
}
