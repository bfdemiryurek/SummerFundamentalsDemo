/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package summerfundementalsdemo;

import java.util.Scanner;

/**
 *
 * @author Lenova
 */
public class Practice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    int x=1;
        while(x<=30)
        {
            System.out.println(x);
            x++;

        if(x%3==0 && x%5==0)
        {
            System.out.println("Fizz Buzz");
        }
        else if(x%3==0)
        {
            System.out.println("Fizz");
        }
        else if(x%5==0)
        {
            System.out.println("Buzz");
        }
        
        }
    
    Scanner scn = new Scanner(System.in);    
    int a;
    int b=1;
    System.out.println("Pick a number:");
    a=scn.nextInt();
    while(b<=10)
    {
        System.out.println(a*b);
        b++;
    }


   
        
        
    
    
    
    
    }
    
}
