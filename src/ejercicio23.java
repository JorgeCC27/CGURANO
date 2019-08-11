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
public class ejercicio23 {
    public static void main(String [ ] args) {
        Scanner entrada19= new Scanner(System.in);
        int a;
        int b;
        int c;
        double resultado1;
        double resultado2;
        
        System.out.print("Ingrese el valor de a: ");
        a= entrada19.nextInt();
        
        System.out.print("Ingrese el valor de b: ");
        b= entrada19.nextInt();
        
        System.out.print("Ingrese el valor de c: ");
        c= entrada19.nextInt();
        
        resultado1= ((-(b)+(Math.sqrt((Math.pow(b, b))- (4*a*c))))/(2*a));
        resultado2= ((-(b)-(Math.sqrt((Math.pow(b, b))- (4*a*c))))/(2*a)); 
        
        System.out.println("Los resultados de la ecuacion cuadratica son: " + resultado1 + " y " + resultado2 +".");
        
    }
}
