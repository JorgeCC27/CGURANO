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
public class Ejercicio5 {
    public static void main(String [ ] args) {
        Scanner entrada2= new Scanner (System.in);
        double numero5=0;
        double numero6=0;
        double numero7=0;
        double resultado3=0;
        
        System.out.print(" Ingresa un numero double: ");
        numero5= entrada2.nextDouble();
        
        System.out.print(" Ingresa un numero double: ");
        numero6= entrada2.nextDouble();
        
        System.out.print(" Ingresa un numero double: ");
        numero7= entrada2. nextDouble();
        
        resultado3= numero5 * numero6 * numero7;
               
       System.out.print("La suma de los numero es " + resultado3);
      
    }
}
