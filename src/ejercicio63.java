/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ejercicio63 {
    public static void main(String [ ] args) {
       
        int variable=1;
        do{
            variable = variable + variable;
            System.out.println(variable);
            variable++;
        } while (variable<=100);
    }
}
