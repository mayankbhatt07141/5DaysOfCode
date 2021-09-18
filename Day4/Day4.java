package Day4;
import java.util.ArrayList;
import java.util.List;
/*Question-- 
            You are given an array arr[] of n integers and q queries in an array queries[] of length 2*q containing l, r pair for all q queries. You need to compute the following sum over q queries.
Array is 1-Indexed.
*/
public class Day4 {
    public static void main(String[] args) {
        int n=4;
        int [] arr={1, 2, 3, 4};
        int q=2;
        int [] queries={1, 4, 2, 3};
        System.out.println(querySum(n,arr,q,queries));
    }
   static List<Integer> querySum(int n, int arr[], int q, int queries[])
    {
        List<Integer> lis=new ArrayList<Integer>();
       
        int j=0;
        int l=0;
        int r=0;
        while(j<2*q){
            l=queries[j++];
            r=queries[j++];
            int sum=0;
            for(int i=l-1;i<r;i++){
                sum=sum+arr[i];
            }
            lis.add(sum);
        }
         return lis;
    }
}
