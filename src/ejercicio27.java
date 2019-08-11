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
public class ejercicio27 {
    public static void main(String [ ] args) {
        Scanner entrada23= new Scanner (System.in);
        int numero1;
        int numero2;
        
       System.out.print("Ingrese un numero: ");
       numero1= entrada23.nextInt();
       System.out.print("Ingrese un numero: ");
       numero2= entrada23.nextInt();
       
       if ( numero1 > numero2 ){
           System.out.print("El valor " + numero1 + " es mayor.");
          
       }
       else { 
           System.out.print("El valor " + numero2 + " es mayor.");
           
       }
    }
}
