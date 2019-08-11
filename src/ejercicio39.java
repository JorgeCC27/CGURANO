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
public class ejercicio39 {
    public static void main(String [ ] args) {
        Scanner entrada35= new Scanner(System.in);
        double resistencia1;
        double resistencia2;
        double resistencia3;
        double restotal;
        double inttotal;
        
        System.out.print("Ingresa el valor de la primera resistencia: ");
        resistencia1= entrada35.nextDouble();
        System.out.print("Ingresa el valor de la segunda resistencia: ");
        resistencia2= entrada35.nextDouble();
        System.out.print("Ingresa el valor de la tercera resistencia: ");
        resistencia3= entrada35.nextDouble();
        
        restotal= resistencia1 + resistencia2+ resistencia3;
        inttotal= (15) / (restotal);
        
        System.out.println("La resitencia total del circuito es de: "+ restotal + "ohms.");
        System.out.println("La intesidad total del circuito es de: " + inttotal + "amperios.");
        
    }
}
