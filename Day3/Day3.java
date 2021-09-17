package Day3;

import java.util.Arrays;

public class Day3 {
    public static void main(String[] args) {
        int [] arr1={2, 3, 6, 7, 9};
        int [] arr2={1, 4, 8, 10};
        int n=5;
        int m=4;
        int k=5;
        System.out.println(kthElement(arr1,arr2,n,m,k));
    }
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int T=n+m;
       int [] arr=new int[T];
       int j=0;
       for(int i=0;i<T;i++)
       {
           if(i<n)
           {
               arr[i]=arr1[i];
           }
           else
           {
               arr[i]=arr2[j];
               j++;
           }
       }
       Arrays.sort(arr);
       return arr[k-1];
       
   }
}
