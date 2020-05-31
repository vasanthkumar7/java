/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vowel.count;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class VowelCount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        String name=new String();
        System.out.println(" Enter a string:");
        Scanner s=new Scanner(System.in);
        name=s.nextLine();
        int len=name.length();
        int f=0;
        for(int i=0;i<len;i++)
        {
           if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' ||  name.charAt(i)=='o' ||  name.charAt(i)=='u')
           {
               f++;
           }
             if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' ||  name.charAt(i)=='O' ||  name.charAt(i)=='U')
           {
               f++;
           }
                    
        }
        System.out.println("The number vowels in string is :"+f);  
        
    }

    private static char name(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
