/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findsmall;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Findsmall {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c;
        System.out.println("Enter first number:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter Second number:");
        b=s.nextInt();
        System.out.println("Enter Third number:");
        c=s.nextInt();
        if(a<b && a<c)
        {
            System.out.println(a+" is smallest");
        }
        else if(b<c)
        {
            System.out.println(b+" is smallest");
        }
        else
        System.out.println(c+" is smallest");
    }
    
}
