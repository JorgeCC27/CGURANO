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
public class ejercicio16 {
    public static void main(String [ ] args) {
        Scanner entrada14= new Scanner(System.in);
        String nombre1;
        String nombre2;
        String nombre3;
        
        System.out.print("Ingrese su nombre: ");
        nombre1= entrada14.next();
        
        System.out.print("Ingrese su apellido paterno: ");
        nombre2= entrada14.next();
        
        System.out.print("Ingrese su apellido materno: ");
        nombre3= entrada14.next();
        
        System.out.print("Hola " + nombre1 + " " + nombre2 + " " + nombre3 + ".");
        
    }
}
