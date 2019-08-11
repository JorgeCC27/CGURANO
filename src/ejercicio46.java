/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author Jorge
 */
public class ejercicio46 {
    public static void main(String [ ] args) {
        Random entrada39= new Random();
        int numero;
        
       
        numero= entrada39.nextInt(700-(20+1)+20);
        
        System.out.println("El peso del ascensor: " + numero);
        
        if (numero > 400) {
            System.out.println("El ascensor no puede operar.");
        }
        else  {
            System.out.println("El ascensor puede operar.");
        }
        
        
    }
}

