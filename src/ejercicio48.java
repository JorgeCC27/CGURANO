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
public class ejercicio48 {
    public static void main(String [ ] args) {
        Scanner entrada41= new Scanner (System.in);
        int numero;
        
        System.out.print("Ingrese un numero: ");
        numero= entrada41.nextInt();
        
        if (numero%10 == 0) {
            System.out.print("El numero es multiplo de 10.");
        }
        else {
            System.out.print("El numero no es multiplo de 10.");
        }
    }
}
