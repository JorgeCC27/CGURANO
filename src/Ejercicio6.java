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
public class Ejercicio6 {
    
    public static void main (String [ ] args) {
        Scanner entrada3= new Scanner(System.in);
        int numero8=0;
        int resultado3=0;
        int resultado4=0;
        int resultado5=0;
        
        System.out.print("ingresa la longitud de unos de los lados del cuadrado: ");
        numero8= entrada3.nextInt();
        
        resultado3= numero8 * numero8;
        resultado4= numero8 * 4;
        
        System.out.println(" El area del cuadrado es " + resultado3);
        
        System.out.println(" El perimetro del cuadrado es " + resultado4);
        
           
    }
}
