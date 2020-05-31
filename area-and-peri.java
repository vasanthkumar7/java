/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.peri;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class AreaPeri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter radius of circle:");
        float r;
        float per,area;
        Scanner s=new Scanner(System.in);
        r=s.nextFloat();
        per=(float) (2*3.14*r);
        area=(float)(3.14*r*r);
        System.out.println("perimeter of circle:");
        System.out.println(per);
        System.out.println("area of circle:");
        System.out.println(area);
        // TODO code application logic here
    }
    
}
