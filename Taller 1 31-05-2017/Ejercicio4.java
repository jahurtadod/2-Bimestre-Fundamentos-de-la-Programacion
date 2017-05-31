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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Variables
        int [] lista;
        lista = new int[10];
        int [] mult;
        mult = new int[9];
        int [] coeficientes = { 2, 1, 2, 1, 2, 1, 2, 1 , 2 };
        int diferencia, suma = 0, total;
        int i;
        
        //Ingreso de datos
        for (i = 0 ; i < 10; i++){
            if (i == 0) {
                System.out.println("Ingrese su número de cedula" );
                System.out.print("Ingrese el primer valor numero :" );
                lista[i] = input.nextInt();
            } else {
            System.out.print("Ingrese el siguiente numero :" ); 
            lista[i] = input.nextInt();
            }
        }
        //Proceso 
        for (i = 0 ; i < 9; i++){
            mult[i] = coeficientes[i] * lista[i];
            if (mult[i] >= 10 ){
                mult[i] -= 9;
            }
            suma += mult[i];
            System.out.println(mult[i]);
        }
        diferencia = (int)(suma - (suma % 10) + 10);
        total = diferencia - suma;
        System.out.println("La suma de los digitos: "+suma); 
        System.out.println("Inmediato superior: "+diferencia);
        if (total == lista[9]){
            System.out.println("Es un numero de cedula valido");
        } else {
            System.out.println("No es un numero de cedula valido"); 
        }
    }
} 