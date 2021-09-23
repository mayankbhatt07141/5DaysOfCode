package Day9;
// Count total set bits
// You are given a number N. Find the total count of set bits for all numbers from 1 to N(both inclusive).

import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number");
        int n=s.nextInt();
        s.close();
        System.out.println(countSetBits(n));
    }
    public static int countSetBits(int n){
    
        // Your code here
        int ans=0;
        while(n>0){
        int x=power2in(n);
        int bitsxpower=x*(1<<(x-1));
        int msbleft=n-(1<<x)+1;
        ans=ans+bitsxpower+msbleft;
        n=n-(1<<x);
        }
        return ans;
    }
    static int power2in(int n){
        int x=0;
        while((1<<x)<=n){
            x++;
        }
        return x-1;
    } 
}
