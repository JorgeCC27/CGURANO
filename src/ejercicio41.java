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
public class ejercicio41 {
    public static void main(String [ ] args) {
        Scanner entrada37 = new Scanner (System.in);
        int juan;
        int miguel;
        int erick;
        int donato;
        int luis; 
        
        donato= 8;
        luis= 8;
        erick= donato - 2; 
        miguel= erick * 2;
        juan= donato + luis + erick + miguel;
        
        System.out.print("La edad de Donato y Luis es " + donato + " años, la edad de Erick es " + erick + " años, la edad de Miguel es "+ miguel + " años y la edad de Juan es " + juan + " años.");
    }
}
