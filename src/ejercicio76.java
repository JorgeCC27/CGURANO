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
public class ejercicio76 {
    public static void main(String [ ] args) {
        Scanner entrada76= new Scanner (System.in);
        int numero1;
        int numero2;
        
        System.out.print("Ingresa el numero menor: ");
        numero1=entrada76.nextInt();
        System.out.print("Ingresa el numero mayor: ");
        numero2= entrada76.nextInt();
        
        for(numero1=numero1; numero1<=numero2; numero1++){
            System.out.println(numero1);
        }
    }
}
