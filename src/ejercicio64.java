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
public class ejercicio64 {
    public static void main(String [ ] args) {
        Scanner entrada64= new Scanner (System.in);
       
        int numero1;
        int numero2;
        
        System.out.print("Ingresa el primer numero: ");
        numero1= entrada64.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numero2= entrada64.nextInt();
        
        do{
            System.out.println(numero1);
            numero1= numero1 +1;
        } while (numero1 <= numero2);
    }
}
