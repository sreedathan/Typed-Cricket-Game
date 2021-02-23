
package com.mycompany.cricket;

import java.util.*;
import java.lang.Math; 
public class crick 
{

    int bowling(int u)
    { Scanner sc=new Scanner(System.in);
    int count=0,total=0;
        String[] over=new String[5];
         String[] bat=new String[5];
          int[] runs=new int[5];
        System.out.println("Enter a 6 letter string between a-g Example,abfcdg,aaaggg, For 5 bowlers respectively, Make sure batsman does not see this");
        for(int i=0;i<3;i++)
         over[i]=sc.nextLine();
        System.out.println("Batsman enter your set of strings similarly Example,aaaggg.. SAME characters results in a wicket!Difference will be converted to runs\nExample if you write a and bowler wrote g its a 6! ");
        for(int i=0;i<3;i++)
         bat[i]=sc.nextLine();
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<6;j++)
            {
                if(over[i].charAt(j)==bat[i].charAt(j))
                {
                    System.out.println("Wow bowler got a wicket on his"+(++i)+" over"+(j)+" ball");
                    count++;                    
                }
                if(count==2)
                {
                    break;
                }
           runs[i]=runs[i]+Math.abs(over[i].charAt(j)-bat[i].charAt(j));
        }
    }
        for(int i=0;i<5;i++)
        {
        System.out.println("Runs concededin "+i+"over"+runs[i]);
        }
        for(int i=0;i<5;i++)
        {
           total=total+runs[i];
        }
        if(u==0)
       return(total);
        else if(total>u)
        {
            return(1);
        }
        else
            return(0);
        
    }
    
    public static void main(String args[])
    {
        crick ob=new crick();
       Scanner sc=new Scanner(System.in);
       int u;
       System.out.println("Enter team A name/n Enter team B name");
       String a=sc.nextLine();
       String b=sc.nextLine();
        System.out.println("A random toss");
        if (Math.random() < 0.5){
          System.out.println(a +" Wins");
         }
        else
        {
           System.out.println(b+" Wins");
         }
        int x=0;
         u=ob.bowling(x);
         System.out.println("First team took "+u+" Runs/n Now next team can bat.");
        int op=ob.bowling(u);
        if(op==1)
            System.out.println("Wow second batters won!!");
        else
            System.out.println("Wow You defended your score nice! ");
        
    }
}



    
    
    

