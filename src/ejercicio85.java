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
public class ejercicio85 {
    public static void main(String [ ] args) {
        Scanner entrada85 = new Scanner (System.in);
        int numcalificaciones = 6;
        int calificacion;
        int sumcalificaciones = 0;
        int promedio;
        int c;
        
        for (c=1; c<=numcalificaciones; c++){
            System.out.print("Ingresa una calificacion: ");
            calificacion=entrada85.nextInt();
            sumcalificaciones=sumcalificaciones+calificacion;
        }
        promedio= sumcalificaciones/6;
        
        switch (promedio){
            case 10:
                System.out.print("Excelente.");
                break;
            case 9:
                System.out.print("Muy bien. ");
                break;
            case 8:
                System.out.print("Bien. ");
                break;
            case 7:
                System.out.print("Regular. ");
                break;
            case 6:
                System.out.print("Puedes mejorar. ");
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.print("Estas reprobado. ");
                break;
            default:
                System.out.print("No se detecto la calificacion.");
                break;
        }
        
    }
}
