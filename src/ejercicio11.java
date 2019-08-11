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
public class ejercicio11 {
    public static void main(String [ ] args) {
        Scanner entrada9= new Scanner(System.in);
        double numero1;
        double resultado1;
        double resultado2;
        
        System.out.print("Ingresa el redio del circulo: ");
        numero1= entrada9.nextDouble();
        
        resultado1= Math.PI * Math.pow(numero1, 2);
        resultado2= 2 * Math.PI * numero1;
        System.out.println("El area del circulo es: "+ resultado1 + "." );
        System.out.println("El perimetro del circulo es: "+ resultado2 + ".");
   
    }
}
