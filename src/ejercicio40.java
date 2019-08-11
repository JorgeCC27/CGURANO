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
public class ejercicio40 {
    public static void main(String [ ] args) {
        Scanner entrada36 = new Scanner (System.in);
        int numero1;
        int numero2;
        int numero3;
        
        System.out.print("Ingresa el primer numero: ");
        numero1= entrada36.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numero2= entrada36.nextInt();
        System.out.print("Ingresa el tercer numero: ");
        numero3= entrada36.nextInt();
        
        if (numero1<numero2 && numero1<numero3) { 
            System.out.print("El " + numero1 + " es el valor minimo.");
        }
        if (numero2<numero3 && numero2<numero1) {
            System.out.print("El " + numero2 + " es el valor minimo.");
        }
        if (numero3<numero1 && numero3<numero2) {
            System.out.print("El " + numero3 + " es el valor minimo.");
        }
    }
}
