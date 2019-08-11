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
public class ejercicio24 {
    public static void main(String [ ] args) {
        Scanner entrada20= new Scanner (System.in);
        double dolares;
        double pesos;
        
        System.out.print("Ingresa los dolares a convertir: ");
        dolares= entrada20.nextDouble();
        
        pesos= dolares * 19.12;
        System.out.println("El valor es de " + pesos + " pesos.");
        
    }
}
