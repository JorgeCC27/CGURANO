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
public class Ejercicio7 {
    public static void main(String [ ] args) {
        Scanner entrada4= new Scanner(System.in);
        int numero1;
        int numero2;
        int resultado1;
        int resultado2;
        
        System.out.print("Ingresa el alto del rectangulo:");
        numero1=entrada4.nextInt();
        
        System.out.print("Ingresa el ancho del rectangulo;");
        numero2=entrada4.nextInt();
        
        resultado1= numero1 * numero2;
        resultado2= numero1 + numero1 + numero2 + numero2;
        
        System.out.println("El area del rectangulo es " + resultado1 + ".");
        System.out.println("El perimetro del rectangulo es "+ resultado2 + ".");
    }
    
}
