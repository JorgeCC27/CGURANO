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
public class ejercicio26 {
    public static void main(String [ ] args) {
        Scanner entrada22= new Scanner (System.in);
        int numero1;
        int numero2;
        
        System.out.print("Ingrese un numero entero: ");
        numero1= entrada22.nextInt();
        
        System.out.print("Ingrese un numero entero: ");
        numero2= entrada22.nextInt();
        
        if (numero1 == numero2){
            System.out.println("Los 2 numeros son iguales.");
        }
        else { 
            System.out.println("Los 2 numeros son diferentes.");
        }
        }
    }

