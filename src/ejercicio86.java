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
public class ejercicio86 {
    public static void main(String [ ] args) {
        Scanner entrada86 = new Scanner (System.in);
        String nombre=" ";
        
        System.out.print("Ingresa un nombre: ");
        nombre= entrada86.next();
        
        do {
            switch (nombre){
                case "Adriana":
                case "Mariana":
                case "Katheryn":
                case "Anna.":
                case "Yazmin":
                    System.out.print("Bienvenida mejor amiga. ");
                    break;
                case "Alan":
                case "Luis":
                case "Victor":
                case "Angel":
                case "Roberto":
                case "Fabricio":
                case "Julio":
                    System.out.print("Bienvenido mejor amigo. ");
                default:
                    System.out.print("Bienvenido " + nombre);
                    break;
            } while (nombre!="-1");
           
        
        }
}

