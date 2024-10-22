/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_18_busqueda_lineal;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_18_BUSQUEDA_LINEAL {

    public static void main(String[] args) {
        int[]datos={10, 50, 85, 73, 11};
        int valor, posi=-1;
        Scanner cap = new Scanner(System.in);
        System.out.println("valor a buscar");
        valor=cap.nextInt();
        for (int i = 0; i < datos.length; i++) {
            if(valor== datos[i]){
                //regresar pocision al usuario
                posi = i;
                break;
            }
                
        }if(posi==-1){
                System.out.println("valor no encontrado");
            }else{
                System.out.println("el valor esta en la pocision:"+posi);
            }
    }
}
