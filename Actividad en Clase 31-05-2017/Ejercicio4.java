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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Arreglos
        int[] lista;
        int[] lista1;
        int[] lista2;
        int j = 0, x = 0, suma2 = 0, suma1 = 0, i = 0, temp;
        
        System.out.println("Inserte el número de datos :");
        int n = input.nextInt(); 
        temp = n - (int)(n/2)+1;
        lista = new int[n];
        lista1 = new int[(int)(n/2)+1];
        lista2 = new int[temp];
        for (i = 0; i < lista.length; i++ ){
            System.out.println("Ingrese el valor :");
            lista[i] = input.nextInt();
            if (i % 2 == 0){
                lista1[j]= lista[i];
                suma2 += lista1[j];
                j ++;
                if (i == n-2){
                    lista1[j]= suma2;
                }
            } else {
                lista2[x]= lista[i];
                suma1 += lista2[x];
                x ++;
                if (i == n-1){
                    lista2[x]= suma1;
                }
            }
        }
        System.out.println("Lista 2");
        for (i = 0; i < lista1.length; i++ ){
            System.out.println("Posicion -" +(i+1)+"- :" +lista1[i]);   
        }
        System.out.println("Lista 3");
        for (i = 0; i < lista2.length; i++ ){
            System.out.println("Posicion -" +(i+1)+"- :" +lista2[i]);   
        }
    }  
}