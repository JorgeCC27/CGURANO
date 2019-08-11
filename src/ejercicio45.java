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
public class ejercicio45 {
    public static void main(String [ ] args) {
        Scanner entrada39 = new Scanner (System.in);
        double temperatura;
        int personas;
        int horas;
        
        System.out.print("Ingrese la temperatura de la habitacion: ");
        temperatura= entrada39.nextDouble();
        System.out.print("Ingrese las personas dentro de la habitacion: ");
        personas= entrada39.nextInt();
        System.out.print("Ingrese la hora: ");
        horas= entrada39.nextInt();
        
        if (temperatura >= 35 || personas > 15 || horas > 14 && horas< 19){
            System.out.print("El clima se encuentra encendido.");
        }
        else {
            System.out.print("El clima se encuentra apagado.");
           
    }
}
}