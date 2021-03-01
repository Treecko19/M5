package Assign;




import java.util.Random;
import java.util.*;
import java.util.Scanner;
public class Main
{
   public static int fibrec(int n) {          //function for finding fibonacci using recursive method


        if(n<=1)
        {
        	//System.out.print(n) ; 
            return 1;
        }
        else {
            //System.out.print(n) ;
        	return fibrec(n-1)+fibrec(n-2);
            
        }
    }


    public static int fibite(int n) {          //function for finding fibonacci using iterative method
        if(n<=1)
        {
            return 1;
        }
        int a=0,b=1,c=1,i;
        for(i=2;i<=n;i++)
        {
            a = b + c;
            c = b;
            b = a;
            //System.out.print(a);
        }
        return a;
    }

    public static void main(String[] args) {
      //fibite(0);
      //fibrec(0);
         int i,n=40,fib1,fib2;
        System.out.print("n\tIterative\tRecursive\n");
        System.out.print("==\t=========\t=========\n");
        long start_time,end_time;
        int difference,difference2;
        for(i=20;i<=n;i++) //loop from 20 to 40
        {
            start_time  = System.nanoTime();              //for initial time
            fib1 = fibite(i);         //calling function for finding fibonacci using iterative method
            end_time  = System.nanoTime();                       //for end time
            difference  = (int)((end_time - start_time) / 1e6);      //for calculating difference
            start_time = System.nanoTime();              //for initial time
            fib2 = fibrec(i);         //calling function for finding fibonacci using recursive method
            end_time = System.nanoTime();                       //for end time
            difference2 = (int)((end_time - start_time) / 1e6);        //for calculating difference
            System.out.print(i+"\t\t"+difference+"\t\t\t"+difference2 +"\t\n");            //for outputting result
        } 
    } 
}