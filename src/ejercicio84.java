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
public class ejercicio84 {
    public static void main(String [ ] args) {
        Scanner entrada84 = new Scanner (System.in);
        String cara=" ";
        
        System.out.print("Ingresa un estado de animo: ");
      cara= entrada84.next();
        
        switch (cara){
            case (":)"):
                System.out.print("Feliz. ");
                break;
            case (":("):
                System.out.print("Triste. ");
                break;
            case (":$"):
                System.out.print("Apenado. ");
                break;
            default:
                System.out.print("Cara no encontrada. ");
                break;
        }
        
    }
}
