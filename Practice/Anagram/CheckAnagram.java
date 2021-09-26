package Practice.Anagram;


import java.util.Arrays;
import java.util.Scanner;
/* Check whether two strings are anagram of each other
Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, “act” and “tac” are an anagram of each other.*/
public class CheckAnagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        System.out.println(isAnagram(a, b));
        s.close();
        }   
    public static boolean isAnagram(String a,String b){
        char [] x=a.toCharArray();
        char [] y=b.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if(Arrays.equals(x,y)){
            return true;
        }
        
        return false;
    } 
}
