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
public class ejercicio13 {
    public static void main(String [ ] args) {
        Scanner entrada11= new Scanner (System.in);
        int numero1;
        double resultado1;
        
        System.out.print("Ingresa el valor de la prenda de vestir: ");
        numero1= entrada11.nextInt();
        
        resultado1= numero1 * .75 ; 
        System.out.println("El precio final de la prenda es "+ resultado1 +".");
        
    }
}
