/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertmetre;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Convertmetre {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        float inch,metre;
        System.out.println("Enter distance in inch:");
        Scanner s=new Scanner(System.in);
        inch=s.nextFloat();
        metre=(float)(0.0254*inch);
        System.out.println("Distance in metre:");
        System.out.println(metre);
    }
    
}
