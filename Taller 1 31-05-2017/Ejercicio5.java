/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.en.clase.pkg1;

import java.util.Scanner;

/**
 *
 * @author Salas
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        // Variables
        int[] lista, lista1, sum, mult, rest, div;
        int num_veces = 0;
        int i = 0, j = 0;
        
        System.out.println("Inserte el la cantidad de datos de las listas :");
        int n = input.nextInt(); 
        lista = new int[n];
        lista1 = new int[n];
        sum = new int[n];
        rest = new int[n];
        mult = new int[n];
        div = new int[n];
        System.out.println("Primera lista :");
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
        }
        System.out.println("Segunda lista :");
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista1[i] = input.nextInt();
        }
        //Operaciones
        for (i = 0; i < lista.length; i++){
            sum[i]= lista[i]+lista1[i];
            rest[i]= lista[i]-lista1[i];
            mult[i]= lista[i]*lista1[i];
            div[i]= lista[i]/lista1[i];
        }
        // Resultados
        System.out.println("Suma");
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Lista posicion " +(i+1)+ ":" +sum[i]);   
        }
        System.out.println("Resta");
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Lista posicion " +(i+1)+ ":" +rest[i]);   
        }
        System.out.println("Multiplicación");
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Lista posicion " +(i+1)+ ":" +mult[i]);   
        }
        System.out.println("División");
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Lista posicion " +(i+1)+ ":" +div[i]);   
        }
    } 
}
