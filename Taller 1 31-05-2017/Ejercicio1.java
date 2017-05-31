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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        // Variables
        int[] lista;
        int suma = 0;
        int mayor = 0;
        
        System.out.println("Inserte el número de datos :");
        int n = input.nextInt(); 
        lista = new int[n];
        
        for (int i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
            suma += lista[i];
            if (i == 0){
                mayor = lista[i];
            } else if(lista[i]> mayor){
                mayor = lista[i];
            }
        }
        System.out.println("Suma : " +suma);
        System.out.println("Promedio : " +(suma/n));
        System.out.println("El mayor  : " +mayor);  
    }   
}
