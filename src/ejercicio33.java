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
public class ejercicio33 {
    public static void main(String [ ] args) {
        Scanner entrada29= new Scanner (System.in);
        int numero1;
        
        System.out.print("Ingrese un numero del 1 al 100:");
        numero1= entrada29.nextInt();
        
        if (numero1 <= 10){
            System.out.print("Es un niño. ");
        }
        if (numero1 <= 18 && numero1 >10){
            System.out.print("Es un adolescente. ");
        }
        if (numero1 <= 60 && numero1 >18 ){
            System.out.print("Es un adulto. ");
        }
        if (numero1 <= 100 && numero1 >60 ){
            System.out.print("Es un alduto mayor. ");
        }
    }
}
