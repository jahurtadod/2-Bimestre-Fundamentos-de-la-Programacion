/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author jahurtadod
 */
public class Ejercicio1 {
    static double iva = 0.14;
    public static Scanner input = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Variables
        int op;
        double descuento = 0;
        double resultado = 0, resultado2 = 0, valor;
        // Se crea una variable 
        mensaje();
        System.out.println("Ingrese el valor de la subcompra: ");
        valor = input.nextInt();
        resultado = calculoIva(valor);
        System.out.println("El calculo del valor mas Iva: "+resultado);
        System.out.println("Seleccione el tipo de empresa: ");
        System.out.println(" 1-Publica\n 2-Privada\n 3-Persona Natural");
        op = input.nextInt();
        switch (op){
            case (1): 
                descuento = 0.06; 
                break;
            case (2): 
                descuento = 0.02; 
                break;
            case (3): 
                descuento = 0.08; 
                break;            
        }
        resultado2 = calculoDescuento(descuento , valor);
        System.out.print("El calculo con el descuento es: "+(resultado2+(resultado - valor)));
    }
    public static void mensaje (){
        System.out.println("Mensaje puto");   
    }
    public static double calculoIva (double subtotal){
        double subtotal2 = subtotal * iva;
        double total = subtotal + subtotal2;
        return total;
    }
    public static double calculoDescuento (double descuento, double valor){
        double subtotal2 = descuento*valor;
        double total = valor - subtotal2;
        return total;
    }
    
}
