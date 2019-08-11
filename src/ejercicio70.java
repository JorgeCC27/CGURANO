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
public class ejercicio70 {
    public static void main(String [ ] args) {
        Scanner entrada70 = new Scanner (System.in);
        int numcalificaciones = 6;
        int calificacion;
        int sumcalificaciones = 0;
        double promedio;
        int c;
        
        for (c=1; c<= numcalificaciones; c++){
            System.out.print("Ingresa la calificacion: ");
            calificacion = entrada70.nextInt();
            sumcalificaciones= sumcalificaciones + calificacion;
        }
        promedio= sumcalificaciones/numcalificaciones;
        System.out.println("El promedio es: " + promedio);
        
        if (promedio<=100 && promedio>90) {
            System.out.print("El alumno alcanzo una A.");
        }
        if (promedio<=89 && promedio>80) {
            System.out.print("El alumno alcanzo una B.");
        }
        if (promedio<=79 && promedio>60) {
            System.out.print("El alumno alcanzo una C.");
        }
        if (promedio<=59 && promedio>50) {
            System.out.print("El alumno alcanzo una D.");
        }
        if (promedio<=49){
            System.out.print("El alumno alcanzo una E.");
        }
    }
}
