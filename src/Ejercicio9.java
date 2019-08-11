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
public class Ejercicio9 {
    public static void main(String [ ] args) {
        Scanner entrada6= new Scanner (System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int resultado1;
        int resultado2;
        
        System.out.print("Ingresa la base del trapecio: ");
        numero1= entrada6.nextInt();
        
        System.out.print("Ingresa la base superior del trapecio: ");
        numero2= entrada6.nextInt();
        
        System.out.print("Ingresa el lado izquierdo del trapecio; ");
        numero3= entrada6.nextInt();
        
        System.out.print("Ingresa el lado derecho del trapecio: ");
        numero4=entrada6.nextInt();
        
        System.out.print("Ingresa la altura del trapecio: ");
        numero5 = entrada6.nextInt();
        
        resultado1= numero1 + numero2+ numero3+ numero4;
        resultado2= (numero1 * numero5) + ((numero1 - numero5) / 2);
        
        System.out.println("El perimetro del trapecio es: "+ resultado1 + ".");
        System.out.println("El area del trapecio es "+ resultado2 + ".");
    }
    
}
