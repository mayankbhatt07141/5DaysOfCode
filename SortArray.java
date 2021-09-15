import java.util.Scanner;
public class SortArray{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=s.nextInt();
        int [] a=new int[n];
        System.out.println("Enter the array elements");
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        sort012(a,n);
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }
    }
    public static void sort012(int a[], int n)
    {
        // code here 
        int count0=0;
        int count1=0;
        for(int i=0;i<n;i++){
            if(a[i]==0){
                count0++;
            }
            else if(a[i]==1){
                count1++;
            }
        }
        for(int i=0;i<n;i++){
            if(i<count0){
                a[i]=0;
            }
            else if(i<count1+count0){
                a[i]=1;
            }
            else{
                a[i]=2;
            }
        }
    }
   
}