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
public class ejercicio28 {
    public static void main(String [ ] args) {
        Scanner entrada24= new Scanner (System.in);
          int numero1;
        int numero2;
        
       System.out.print("Ingrese un numero: ");
       numero1= entrada24.nextInt();
       System.out.print("Ingrese un numero: ");
       numero2= entrada24.nextInt();
       
       if ( numero1 >= numero2 ){
           System.out.println("El valor " + numero1 + " es mayor.");
          
       }
       else { 
           System.out.println("El valor " + numero2 + " es mayor.");
           
       }
       
       if (numero1 != numero2){ 
           System.out.println("Los numeros son diferentes.");
       }
       else {
           System.out.println("Los numeros son iguales. ");
       }      
    }
}
