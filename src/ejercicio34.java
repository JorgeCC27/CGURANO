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
public class ejercicio34 {
    public static void main(String [ ] args) {
        Scanner entrada30= new Scanner (System.in);
        String nombre1;
        
        System.out.print("Ingrese su nombre: ");
        nombre1= entrada30.next();
        
        if(nombre1.equalsIgnoreCase ("jose")  ) {
            System.out.print("Usted no es bienvenido.");
        }
        else {
            System.out.print("Usted si es bienvenido.");
            
        }
    }
}
