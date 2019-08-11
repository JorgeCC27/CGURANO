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
public class ejercicio19 {
    public static void main(String [ ] args) {
        Scanner entrada16= new Scanner (System.in);
        double numero1;
        double numero2; 
        double resultado1;
        
        System.out.print("Ingresa el valor del radio del cilindro: ");
        numero1= entrada16.nextDouble();
        
        System.out.print("Ingresa el valor de la altura del clindro: ");
        numero2= entrada16.nextDouble();
        
        resultado1= numero2 * Math.PI * Math.pow(numero1, numero1);
        
        System.out.print("El volumen del cilindro es: "+ resultado1 + ".");
        
        
    }
}
