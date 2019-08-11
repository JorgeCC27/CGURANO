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
public class Ejercicio17 {
    public static void main(String [ ] args) {
        Scanner entrada15= new Scanner (System.in);
        int numero1;
        int numero2;
        int numero3;
        int numero4;
        int numero5;
        int numero6;
        int promedio1;
        
        System.out.print("Ingresa la calificacion numero 1: ");
        numero1= entrada15.nextInt();
        System.out.print("Ingresa la calificacion numero 2: ");
        numero2= entrada15.nextInt();
        System.out.print("Ingresa la calificacion numero 3: ");
        numero3= entrada15.nextInt();
        System.out.print("Ingresa la calificacion numero 4: ");
        numero4= entrada15.nextInt();
        System.out.print("Ingresa la calificacion numero 5: ");
        numero5= entrada15.nextInt();
        System.out.print("Ingresa la calificacion numero 6: ");
        numero6= entrada15.nextInt();
        
        promedio1= ((numero1 + numero2+ numero3+ numero4+ numero5+ numero6)/6);
        
        System.out.print("El promedio final de las calificaciones es: " + promedio1+ ".");
        
        
    }
    
}
