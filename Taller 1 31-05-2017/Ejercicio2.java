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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        // Variables
        int[] lista;
        int menor = 0;
        
        System.out.println("Inserte el número de datos :");
        int n = input.nextInt(); 
        lista = new int[n];
        
        for (int i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
            if (i == 0){
                menor = lista[i];
            } else if(lista[i]< menor){
                menor = lista[i];
            }
        }
        System.out.println("El número menor es : " +menor);  
        
    }
    
}