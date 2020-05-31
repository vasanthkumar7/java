/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package findcube;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Findcube {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.println("Input number of terms:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        for(int i=1;i<=num;i++)
        {
            System.out.println("Number is:"+i+" and cube of "+i+"is:"+i*i*i);
        }
        
    }
    
}
