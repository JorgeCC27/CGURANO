/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jorge
 */
public class ejercicio66 {
    public static void main(String [ ] args) {
        int variable1=1;
        int variable2=7;
        int variable3;
        do{
            variable3= variable1 * variable2;
            System.out.println(variable1 + " x " + variable2 + " = " + variable3);
            variable1++;
        } while ((variable2==7) && (variable1<=10));
    }
}
