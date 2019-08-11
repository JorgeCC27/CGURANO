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
public class ejercicio82 {
    public static void main(String [ ] args) {
       Scanner entrada82 = new Scanner (System.in);
       int numero;
       System.out.print("Ingresa el numero entre 1 y 12: ");
       numero=entrada82.nextInt();
       
       switch (numero){
           case 1:
               System.out.print("Enero.");
               break;
           case 2:
               System.out.print("Febrero.");
               break;
           case 3:
               System.out.print("Marzo. ");
               break;
           case 4:
               System.out.print("Abril. ");
               break;
           case 5:
               System.out.print("Mayo. ");
               break;
           case 6:
               System.out.print("Junio. ");
               break;
           case 7:
               System.out.print("Julio. ");
               break;
           case 8:
               System.out.print("Agosto. ");
               break;
           case 9:
               System.out.print("Septiembre. ");
               break;
           case 10:
               System.out.print("Octubre. ");
               break;
           case 11:
               System.out.print("Noviembre. ");
               break;
           case 12:
               System.out.print("Diciembre. ");
               break;
           default:
               System.out.print("Mes no encontrado. ");
               break;
       }
    }
}
