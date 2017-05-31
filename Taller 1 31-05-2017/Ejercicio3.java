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
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        // Variables
        int[] lista;
        int num_veces = 0;
        int i = 0, j = 0;
        
        System.out.println("Inserte el número de datos :");
        int n = input.nextInt(); 
        lista = new int[n];
        
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
        }
        System.out.println("Lista");
        for (i = 0; i < lista.length; i++){
            for (j = 0; j < lista.length; j++ ){
                if (lista[i] == lista[j]){
                    num_veces += 1 ; 
                }
            }
            System.out.println("Posicion -"+(i+1)+" : "+lista[i]+" se repite " + num_veces+" vez"); 
        }
    } 
}
