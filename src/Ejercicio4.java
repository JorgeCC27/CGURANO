/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class Ejercicio4 {
    
    public static void main (String [ ] args) {
        
        Scanner entrada2= new Scanner( System.in);
        int numero3=0;
        int numero4=0;
        int resultado2=0;
        
        System.out.print(" Ingresa un numero entero :");
        numero3=entrada2.nextInt();
        
        System.out.print(" Ingresa un numero entero : ");
        numero4= entrada2.nextInt();
        
        resultado2= numero3 + numero4;
        
        System.out.print(" La suma de ambos numero es " + resultado2);
              
        
    }
    
}
