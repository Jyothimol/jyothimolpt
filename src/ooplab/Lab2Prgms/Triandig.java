/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooplab.Lab2Prgms;

/**
 *
 * @author MCALB01014
 */
import java.util.*;
public class Triandig
{
    public static void main(String s[])
    {
        int i,j,n;
        Scanner Sc=new Scanner(System.in);
        System.out.print("enter the limits");
        n=Sc.nextInt();
        for(i=0;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
         }
       
    }
}
