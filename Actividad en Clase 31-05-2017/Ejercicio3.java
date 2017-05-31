/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller.pkg1.pkg31.pkg05.pkg2017;
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
        
        // Arreglos
        int[] lista;
        
        System.out.println("Inserte el número de datos :");
        int n = input.nextInt(); 
        lista = new int[n];
        
        for (int i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
        }
        for (int i = 0; i < lista.length; i+=2 ){
            System.out.println("Lista posicion " +(i+1)+ ": " +lista[i]);
        }
    }  
}