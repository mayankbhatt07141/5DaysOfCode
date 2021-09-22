package Day8;
/*Given two strings A and B, find the minimum number of times A has to be repeated such that B becomes a substring of the repeated A. If B cannot be a substring of A no matter how many times it is repeated, return -1.*/
import java.util.Scanner;
public class Day8 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string A");
        String A=s.nextLine();
        System.out.println("Enter the string B");
        String B=s.nextLine();
        System.out.println(repeatedStringMatch(A, B));
        s.close();
        
    }
    static int repeatedStringMatch(String A,String B){
        int count=B.length()/A.length();
        int ans=1;
        String s=A;
        for(int i=0;i<=count+1;i++){
            if(s.contains(B)){
                return ans;
            }
            s=s+A;
            ans++;
        }
        
        
        return -1;

    }
}