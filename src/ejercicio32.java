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
public class ejercicio32 {
    public static void main(String [ ] args) {
        Scanner entrada28= new Scanner (System.in);
        int numero1;
        
        System.out.print("Ingrese un numero del 1 al 7:");
        numero1= entrada28.nextInt();
        
        if (numero1 == 1){
            System.out.print("El dia es lunes .");
               }
        if (numero1 == 2){
            System.out.print("El dia es martes.");
               }
        if (numero1 == 3){
            System.out.print("El dia es miercoles.");
               }
        if (numero1 == 4){
            System.out.print("El dia es jueves.");
               }
        if (numero1 == 5){
            System.out.print("El dia es viernes.");
               }
        if (numero1 == 6){
            System.out.print("El dia es sabado.");
               }
        if (numero1 == 7){
            System.out.print("El dia es domingo.");
               }
    }
}
