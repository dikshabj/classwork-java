// Online Java Compiler
// Use this editor to write, compile and run your Java code online
//write a program in java to accept salary of an employee and calculate their net payable amount
     //as given criteria , hra @15% , da@7% , pf@5%
     //wap in java to accept two values and swap them
import java.util.Scanner;
class class1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double gs,  hr, da, pf, net;
       
        System.out.println("Enter gross salary : ");
        gs = sc.nextDouble();

        hr = gs*15/100;
        da = gs*7/100;
        
        pf = gs*5/100;
        net = gs+hr+da-pf;
         System.out.println("Net payable amount is :");
        System.out.println(net);
        
    }
}