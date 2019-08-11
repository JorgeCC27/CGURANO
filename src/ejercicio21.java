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
public class ejercicio21 {
    public static void main(String [ ] args) {
        Scanner entrada18= new Scanner(System.in);
        double numero1;
        double resultado1;
        double resultado2;
        
        System.out.print("Ingresa la temperatura en grados centigrados: ");
        numero1= entrada18.nextDouble();
        
        resultado1= ((9 * numero1)/5) + 32;
        resultado2= numero1 + 273.15;
        
        System.out.println("La temperatura en Fahrenheit es: " + resultado1 + ".");
        System.out.println("La temperatura en Kelvin es: " + resultado2 + ".");
        
    }
}
