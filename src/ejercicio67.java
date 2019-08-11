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
public class ejercicio67 {
    public static void main(String [ ] args) {
        Scanner entrada67= new Scanner (System.in);
        int numero1;
        int numero2=1;
        
        System.out.println("Ingrese un numero: ");
        numero1=entrada67.nextInt();
        
        do{
            System.out.println(numero1*numero2);
            numero2=numero2+1;
        } while ((numero1==numero1) && (numero2<=10));
        
    }
}
