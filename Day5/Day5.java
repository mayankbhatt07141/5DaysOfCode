package Day5;

import java.util.Arrays;

/*  Given two sorted arrays array1 and array2 of size m and n respectively. Find the median of the two sorted arrays.*/ 
public class Day5 {
    public static void main(String[] args) {
        int m = 3;
        int n = 4;
        int array1[] = {1,5,9};
        int array2[] = {2,3,6,7};
        System.out.println(medianOfArrays(m,n,array1,array2));
    }
    static double medianOfArrays(int n, int m, int a[], int b[]) 
   {
      int y = 0;
      int[] res = new int[n+m];
      
      for(int i=0;i<n;i++)
          res[i]= a[i];
          
      for(int i=0;i<m;i++)
          res[i+n]= b[i];
          
      Arrays.sort(res);
      
      if(res.length<2)
      {
          
          return (res[0]+res[1])/2;
      }
      
      if(res.length%2==0)
      {
        y= res.length/2;
        double ans=((double)(res[y-1]+res[y])/2);
        return ans;
      }
      
      else
      y= (res.length+1)/2;
      
      return res[y];
   }
}
