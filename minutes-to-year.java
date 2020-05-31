/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mintoyear;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Mintoyear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float min,year,days;
        float year2;
        float day2;
       System.out.println("Input number of minutes:");
       Scanner s=new Scanner(System.in);
       min=s.nextInt();
       year=(int)(min/525600);
       year2=(float) (min%525600);
    day2=(int)(year2%365);
       System.out.println("Years:");
       System.out.println(year);System.out.println("Days: ");
       System.out.println(day2);
       
       
    }
    
}
