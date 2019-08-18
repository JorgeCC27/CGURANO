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
        
        System.out.print("Ingresa la catidad de filas: ");
        int filas=entrada81.nextInt();
      
       
        int x= 0 ;
             for (int i=0; i<filas; i++){
                int j=0;
                 while(j<=x){
                  System.out.print("*");
                  j++;
                 }
                x++;
                System.out.println("");
        }
    }
}

        
        
    

