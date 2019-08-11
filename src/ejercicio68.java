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
public class ejercicio68 {
    public static void main(String [ ] args) {
        Scanner entrada68 = new Scanner (System.in);
        int comando;
        String nombre1;
        String nombre2;
        String juego;
        boolean bandera;
        
       do {
            System.out.print("Ingresa un comando:");
            comando=entrada68.nextInt();
        switch (comando){
        case 1:
            System.out.print("Ingrese el nombre del jugador y el juego:");
            nombre1= entrada68.next();
            juego= entrada68.next();
            System.out.println("Bienvenido "+ nombre1 + ", el juego que vas a jugar es "+ juego);
            break;
        
        case 2:
            System.out.print("ingresa el nombre de los jugadores y el juego: ");
            nombre1= entrada68.next();
            nombre2= entrada68.next();
            juego= entrada68.next();
            System.out.println("Bienvenidos "+nombre1 + " y "+nombre2 + ", el juego que van a jugar es "+ juego );
            break;
            
        case 3:
            System.out.println("El juego se encuentra actualizado.");
            break;
            
        case 4:
            System.out.println("Hasta luego, muchas gracias por jugar.");
            bandera=false;
            break;
         
    }     
        }while (bandera=true); 
    }
}
