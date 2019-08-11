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
public class ejercicio37 {
    public static void main(String [ ] args) {
        Scanner entrada33= new Scanner(System.in);
        double peso;
        double altura;
        double imc;
        
        System.out.print("Ingresa el peso de la persona: ");
        peso= entrada33.nextDouble();
        System.out.print("Ingresa la altura de la persona: ");
        altura= entrada33.nextDouble();
        
        imc= (peso)/(altura*altura);
        
        System.out.print("El IMC de la persona es : "+ imc + ".");
    }
    
}
