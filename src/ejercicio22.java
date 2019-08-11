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
public class ejercicio22 {
    public static void main(String [ ] args) {
        Scanner entrada19= new Scanner (System.in);
        double numero1;
        double resultado1;
        
        System.out.print("Introduce la velocidad en km/h: ");
        numero1= entrada19.nextDouble();
        
        resultado1= ((numero1 * 1000)/3600);
        
        System.out.println("La conversion es: "+ resultado1 + " m/s.");
        
    }
}
