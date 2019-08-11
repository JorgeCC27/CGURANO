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
public class ejercicio57 {
    public static void main(String [ ] args) {
        Scanner entrada57= new Scanner (System.in);
        int numero1;
        int numero2=1;
        
        System.out.print("Ingrese un numero: ");
        numero1=entrada57.nextInt();
        
        while ((numero1==numero1 ) && (numero2<=10)) {
            System.out.println(numero1*numero2);
            numero2++;
        }
    }
}
