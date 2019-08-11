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
public class Ejercicio20 {
    public static void main(String [ ] args) {
        Scanner entrada17= new Scanner (System.in);
        double numero1;
        double resultado1;
        
        System.out.print("Ingresa el radio de la esfera: ");
        numero1 = entrada17.nextDouble();
        
        resultado1= (((1.3333333333) * Math.pow(numero1, 3)) * Math.PI);
        System.out.println("El volumen de la esfera es: " + resultado1 + ".");
        
        
        
        
    }
    
}
