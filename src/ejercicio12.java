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
public class ejercicio12 {
    public static void main(String [ ] args) {
        Scanner entrada10= new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        int resultado1;
        int resultado2;
        
        System.out.print("Ingrese el valor de uno de los lados del poligono: ");
        numero1= entrada10.nextInt();
        
        System.out.print("Ingrese el valor de la altura de uno de los triangulos: ");
        numero2= entrada10.nextInt();
        
        System.out.print("Ingresa el numero de lados que tiene el poligono: ");
        numero3= entrada10.nextInt();
        
        resultado1= numero1* numero3;
        resultado2= (numero1* numero2 / 2) * numero3;
        
        System.out.println("El perimetro del poligono es :" + resultado1 + ".");
        System.out.println("El area del poligono es: "+ resultado2 + ".");
        
    }
}
