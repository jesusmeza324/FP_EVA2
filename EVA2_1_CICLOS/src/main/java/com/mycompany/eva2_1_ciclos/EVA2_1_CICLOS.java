/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eva2_1_ciclos;

import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class EVA2_1_CICLOS {

    public static void main(String[] args) {
        //repeticion de instrucciones
        //ciclos o bucles
        //for(desde) ,while(mientras),do while(hacer mientras)
        //for cuando saben cuantas veces se va repetir la instruccion
        // for es un contador
        //while cuando se repite 0 o n veces
        //cuando se repite al menos 1 vez hasta n veces son condicionales
        //ciclo FOR tiene tres parametros
        //punto de inicio
        //condicion
        //avance o retroceso
        //i--->indice
        //++--->operador para sumar unidad
        //-- ---> resta unidad
        // += resta n valor
        // += resta n valor
        // += multiplica n valor
        //alcance es el lugar donde existe un identificador 
        //bloque de codigo que son las llaves
        
        for (int i=1; i<=10; i++){//la variable solo existe dentro del for
            System.out.print(i + "-"); 
           }
        
        System.out.println("");
        for (int i=10; i>=1; i--){
            System.out.print(i + "-"); 
           }
        }
}
