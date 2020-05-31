/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validornot;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Validornot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        if( num>0)
        {
            System.out.println("it is a positive number");
    }
        if(num<0)
        {
            System.out.println("it is a negative number");
        }
        if(num==0)
        {
            System.out.println("it is zero");
        }
    
}
