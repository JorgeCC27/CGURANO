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
public class ejercicio14 {
    public static void main(String [ ] args) {
        Scanner entrada12=new Scanner (System.in);
        double numero1;
        double numero2;
        double resultado1;
        
        System.out.print("Ingresa la distancia recorrida en metros: ");
        numero1 = entrada12.nextDouble();
        
        System.out.print("Ingresa la velocidad del objeto en m/s: ");
        numero2= entrada12.nextDouble();
        
        resultado1 = numero1  / numero2; 
        
        System.out.println("El tiempo en el que se hizo el recorrido es: " +resultado1 +" segundos." );
        }    
    }

