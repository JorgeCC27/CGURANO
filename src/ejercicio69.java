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
public class ejercicio69 {
    public static void main(String [ ] args) {
        Scanner entrada69 = new Scanner (System.in);
        int numerocalificaciones = 0;
        int calificaciones = 0;
        int sumacalificaciones = 0;
        double promedio;
        int c;
        System.out.print("Ingresa el numero de calificaciones: ");
        numerocalificaciones = entrada69.nextInt();
        
        for (c = 1; c<=numerocalificaciones; c++){
            System.out.print("Ingrese la calificacion: " );
            calificaciones= entrada69.nextInt();
            sumacalificaciones= sumacalificaciones + calificaciones;
                       
        } 
            promedio= sumacalificaciones/numerocalificaciones;
            
            System.out.print("El promedio final es de: " + promedio);
            
    }
}
