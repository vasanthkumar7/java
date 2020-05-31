/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumofdigits;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Sumofdigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num,a,sum=0;
        System.out.println("Enter a number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num>0)
        {
            a=num%10;
            sum=sum+a;
            num=num/10;
        }
        System.out.println("sum of digits of integer:");
        System.out.println(sum);
    }
    
}
