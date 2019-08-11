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
public class ejercicio30 {
    public static void main(String [ ] args) {
        Scanner entrada26= new Scanner (System.in);
        int numero1;
        int numero2;
        
        System.out.print("Ingrese las horas: ");
        numero1= entrada26.nextInt();
       
        
        if (numero1 < 12){
            System.out.print("Buenos dias.");
           }
        if (numero1 >= 12 && numero1 < 18){
            System.out.print("Buenas tardes. ");
}
        if (numero1 >= 18) { 
            System.out.print("Buenas noches. ");
        }
    }
}

