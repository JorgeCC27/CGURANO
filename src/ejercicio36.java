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
public class ejercicio36 {
    public static void main(String [ ] args) {
        Scanner entrada32= new Scanner (System.in);
        int horas;
        int minutos;
        int segundos;
        
        System.out.print("Ingresa las horas: ");
        horas= entrada32.nextInt();
        System.out.print("Ingresa los minutos: ");
        minutos= entrada32.nextInt();
        System.out.print("Ingresa los segundos: ");
        segundos= entrada32.nextInt();
        
        if(horas>24) {
            System.out.print("La hora es incorrecta. ");
    }
        else {
            
        }
        if(minutos>=60){
            System.out.print("Los minutos son incorrectos. ");
        }
        else{
            
        } 
        if(segundos>=60){
            System.out.print("Lo segundos son incorrectos. ");
        }
        else{
            
        }
        
        System.out.print("La hora es: "+ horas + ":"+ minutos + ":" +segundos+ ".");
    }
    }
