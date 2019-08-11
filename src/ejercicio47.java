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
public class ejercicio47 {
    public static void main(String [ ] args) {
        Scanner entrada40 = new Scanner (System.in);
        double consumo;
        int fecha;
        int edad;
        double preciofinal;
        
        System.out.print("Ingrese el consumo total de la persona; ");
        consumo= entrada40.nextDouble();
        System.out.print("ingrese la fecha de nacimiento de la persona: ");
        fecha= entrada40.nextInt();
        
        edad= 2019 - fecha;
        
        if (edad < 15 || edad > 60) {
            preciofinal= consumo * 0.8;
            System.out.println("El consumo con el descuento del 20% es de: "+ preciofinal + ".");
            }
        else {
            preciofinal= consumo;
            System.out.println("El consumo del cliente es de: " + preciofinal + ".");
        }
    }

}
