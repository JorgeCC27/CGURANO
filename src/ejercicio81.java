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
public class ejercicio81 {
    public static void main(String [ ] args) {
        Scanner entrada81 = new Scanner (System.in);
        
        System.out.print("Ingresa un valor: ");
        int x=entrada81.nextInt();
        entrada81.close();
               hfghfhfghf
        System.out.println();
        for (int i=1; i<=x; i++){
            for(int j=1; j<=x-i; j++){
                System.out.print(" ");
            }
            for (int t=1; t<=(i*2)-1; t++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}

        
        
    

