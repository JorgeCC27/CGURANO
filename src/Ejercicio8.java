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
public class Ejercicio8 {
    public static void main(String [ ] args) {
        Scanner entrada5= new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado1;
        int resultado2;
        
        System.out.print("Ingresa la base del triangulo: ");
        numero1= entrada5.nextInt();
        
       System.out.print("Ingresa la altura del triangulo: ");
       numero2= entrada5.nextInt();
       
       resultado1= numero1 * numero2 / 2;
       resultado2= numero1 * 3;
       
       System.out.println("El area del triangulo es "+ resultado1 +".");
       System.out.println("El perimetro del triangulo es "+resultado2 + ".");
       
    }
    
}
