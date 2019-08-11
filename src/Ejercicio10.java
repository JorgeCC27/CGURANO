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
public class Ejercicio10 {
    public static void main(String [ ] args) {
        Scanner entrada8= new Scanner (System.in);
        int numero1;
        int numero2;
        int numero3;
        int resultado1;
        int resultado2;
        
        System.out.print("Ingresa el valor de uno de los lados del rombo: " );
        numero1= entrada8.nextInt(); 
        
        System.out.print("Ingresa el valor de la diagonal menor del rombo: ");
        numero2= entrada8.nextInt();
        
        System.out.print("Ingresa el valor de la diagonal mayor del rombo: ");
        numero3= entrada8.nextInt();
        
        resultado1= numero1 * 4;
        System.out.println("El perimetro del rombo es: "+ resultado1 + ".");
        
        resultado2= numero2 * numero3;
        System.out.println("El area del rombo es "+ resultado2 + ".");
    }
}
