/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_14_ciclos_arreglos;

/**
 *
 * @author jesus
 */
public class EVA2_14_CICLOS_ARREGLOS {

    public static void main(String[] args) {
       int[] x,y,z;//todo es arreglos
       int datos, valores[];//un solo arrgelo//valores
       int[] arreglo = new int [20];//arreglo no existe sin esta nomenclatura
       
        for (int i = 0; i < arreglo.length; i++) //manejo de arreglos
        {
            arreglo[i]=(int)(Math.random()*100);///maneja las pocisiones
        }//System.out.println(arreglo); solo imprime la direccion en memoria
        for (int i = 0; i < arreglo.length; i++) {// leer todos los valores
            System.out.print(arreglo[i]+ "-");
            
        }
       
    }
}
