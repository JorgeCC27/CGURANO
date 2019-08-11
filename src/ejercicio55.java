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
public class ejercicio55 {
    public static void main(String [ ] args) {
        Scanner entrada55= new Scanner (System.in);
        String nombre="";
     
        while (!nombre.equals("Katheryn")){
            System.out.println("El nombre del invitado es: " + nombre );
            nombre=entrada55.next();       
    }
        
    }
}
