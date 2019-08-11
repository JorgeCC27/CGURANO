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
public class Ejercicio3 {
    public static void main(String [ ] args) {
        Scanner entrada1 = new Scanner (System.in);
        double num1=0;
        double num2=0;
        double num3=0;
        double resultado1=0;
        
        System.out.print(" ingresa un numero con digitos decimales : ");
        num1= entrada1.nextDouble();
        
        System.out.print(" Ingresa un numero con digitos decimales : ");
        num2= entrada1.nextDouble();
        
        System.out.print(" Ingresa un numero con digitos decimales : ");
        num3= entrada1.nextDouble();
        
                resultado1= num1 + num2 + num3;
        
       System.out.print(" La suma de ambos números es " + resultado1);
    }
}
