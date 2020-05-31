/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binnary.addition;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class BinnaryAddition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a,b,c=0,d=0,e=0;
        double i=0;
        int num,num2,num3;
        System.out.println("Enter a binnary digit:");
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        System.out.println("Enter another number:");
        b=s.nextInt();
        while(a>0)
        {
          num=a%10;
          c=c+(int)(num*pow(2,i));
          a=a/10;
          i=i+1;
        }
        i=0;
        while(b>0)
        {
          num2=b%10;
          d=d+(int)(num2*pow(2,i));
          b=b/10;
          i=i+1;
        }
   int sum=c+d;
   double j=0;
   double r=0;
   System.out.println("original:"+sum);
   if(sum%2!=0)
   {
   while(sum>0)
   {
       num3=(sum%2);
       e=(e*10)+num3;
       sum=sum/2;  
   }
    System.out.println("binnary addition :"+e);
   }
   else
       {
     
      while(sum>0)
   {
       num3=(sum%2);
       if(num3==0)
       {
           j++;
       }
       e=(e*10)+num3;
       sum=sum/2; 
       
   }
      int ed=e;
      while(e>0)
      {
         num3=e%10;
         if(num3==0)
            r++;
         e=e/10;
      }
      double summa= (j-r);
      ed=(int)(ed*pow(10,summa));
       System.out.println("binnary addition :"+ed);
   }
       
  
        // TODO code application logic here
    }
    
}
