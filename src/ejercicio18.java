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
public class ejercicio18 {
    public static void main(String [ ] args) {
        Scanner entrada15= new Scanner(System.in);
        int numero1;
        int resultado1;
        
        System.out.print("Ingrese uno de los lados del cubo: ");
        numero1= entrada15.nextInt();
        
        resultado1= numero1 * numero1 * numero1;
        
        System.out.print("El volumen del cubo es: " + resultado1 + ".");
    }
}
