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
public class ejercicio83 {
    public static void main(String [ ] args) {
        Scanner entrada83 = new Scanner (System.in);
        int numero;
        System.out.print("Ingresa un numero del 1 al 7: ");
        numero = entrada83.nextInt();
        
        switch (numero){
            case 1:
                System.out.print("Lunes. ");
                break;
            case 2:
                System.out.print("Martes. ");
                break;
            case 3:
                System.out.print("Miercoles. ");
                break;
            case 4:
                System.out.print("Jueves. ");
                break;
            case 5:
                System.out.print("Viernes. ");
                break;
            case 6:
                System.out.print("Sabado. ");
                break;
            case 7: 
                System.out.print("Domingo. ");
                break;
            default:
                System.out.print("Dia no encontrado. ");
                break;     
        }
    }
}
