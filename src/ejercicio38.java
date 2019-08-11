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
public class ejercicio38 {
    public static void main(String [ ] args) {
        Scanner entrada34= new Scanner (System.in);
        double kilos;
        double newtons;
        
        System.out.print("Ingresa los kilos a convertir: ");
        kilos= entrada34.nextDouble();
        
        newtons= (kilos * 9.8);
        
        System.out.print("La conversion es: " + newtons + "N.");
        
    }
}
