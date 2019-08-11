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
public class ejercicio35 {
    public static void main(String [ ] args) {
        Scanner entrada31 = new Scanner(System.in);
        double numero1;
        double numero2;
        double numero3;
        double suma;
        double total;
        System.out.print("Ingresa el valor de la primera prenda: ");
        numero1 = entrada31.nextInt();
        System.out.print("Ingresa el valor de la segunda prenda: ");
        numero2= entrada31.nextInt();
        System.out.print("Ingresa el valor de la tercera prenda: ");
        numero3= entrada31.nextInt();
        
        suma = numero1 + numero2+ numero3;
        
        if (suma>2000){
            total= (suma* 0.7);
        }
        else {
            total= (suma*.95);
        }
        System.out.print("El total de las prendas es: " + total+ ".");
    }
}
