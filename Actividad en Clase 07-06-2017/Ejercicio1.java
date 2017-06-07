/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividaenclase07.pkg06.pkg2017;
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
        int filas;
        int columnas;
        int i, j;
                
        System.out.println("Ingrese el número de filas");
        filas = input.nextInt();
        System.out.println("Ingrese el número de columnas");
        columnas = input.nextInt();
        
        int[][] matriz = new int[filas][columnas];
        
        for (i = 0; i < filas; i++){
            for (j = 0; j < columnas; j++){
                System.out.print("Ingrese el valor: ");
                matriz[i][j] = input.nextInt();
            }
        }
        System.out.println("Presentación: ");
        for (i = 0; i < filas; i++){
            for (j = 0; j < columnas; j++){
                System.out.print(" "+matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}