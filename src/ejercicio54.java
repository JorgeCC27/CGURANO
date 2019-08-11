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
public class ejercicio54 {
    public static void main(String [ ] args) {
        Scanner entrada54= new Scanner (System.in);
        int numero;
        int numero2;
        
        System.out.print("Ingresa el primer numero: ");
        numero= entrada54.nextInt();
        System.out.print("Ingresa el segundo numero: ");
        numero2= entrada54.nextInt();
        
        while (numero <= numero2){
            System.out.println(numero);
            numero=numero + 1;
        }
            
            
        }
        
}
