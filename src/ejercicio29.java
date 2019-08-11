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
public class ejercicio29 {
    public static void main(String [ ] args) {
        Scanner entrada25= new Scanner (System.in);
        int numero1;
        int numero2;
        int numero3;
        
        System.out.print("Ingrese un numero: ");
        numero1= entrada25.nextInt();
        
        System.out.print("Ingrese un numero: ");
        numero2= entrada25.nextInt();
        
        System.out.print("Ingrese un numero: ");
        numero3= entrada25.nextInt();
        
        if (numero1 > numero2 && numero1> numero3){
            System.out.print("El valor " + numero1 + " es mayor.");
           
        }
        if (numero2 > numero1 && numero2 > numero3) {
            System.out.print("El valor " + numero2 + " es mayor.");
    }
        if (numero3 > numero1 && numero3 > numero2){
            System.out.print("El valor "+ numero3 + " es mayor.");
        }
        
        
    }
    
}
