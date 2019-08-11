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
public class ejemplosemana4 {
  
  public static void  main(String [ ] args) {
      Scanner entrada = new Scanner( System.in);
      int numero1= 0;
      int numero2= 0;
      int resultado=0;
      
      System.out.print(" Ingresa un numero entero :");
      numero1=entrada.nextInt();
      
      System.out.print(" Ingresa un numero entero :");
      numero2=entrada.nextInt();
      
      resultado= numero1 + numero2;
      
      System.out.print(" La suma de ambos numeros es " + resultado);
  
  }
    
}
