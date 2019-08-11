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
public class ejercicio79 {
    public static void main(String [ ] args) {
        Scanner entrada79 = new Scanner (System.in);
        int variable1;
        int variable2 = 1;
        int variable3;
        
        System.out.print("Ingrese un numero: ");
        variable1=entrada79.nextInt();
        
        for (variable2=1; variable2<=10; variable2++){
            variable3= variable1* variable2;
            System.out.println(variable1 + " x " + variable2 + " = " + variable3);
        }
    }
}
