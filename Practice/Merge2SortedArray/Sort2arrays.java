package Practice.Merge2SortedArray;

public class Sort2arrays {
    public static void main(String[] args){
        int [] a={2,5,7,9};
        int [] b = {1,3,5,8,10};
        sort(a,b,4,5);
        for(int i=0;i<4;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<5;i++){
            System.out.println(b[i]);
        }
        
    }
    static void sort(int a[],int b[],int n, int m){
        int [] res=new int[n+m];
        int i = 0;
        int j = 0;
        int k=0;
        while(i<n && j<m){
            if(a[i]<b[j]){
                res[k++]=a[i++];
            }
            else{
                res[k++]=b[j++];
            }
        }
        while(i<n){
            res[k++]=a[i++];
        }
        while(j<m){
            res[k++]=b[j++];
        }
        i=0;
        k=0;
        while(i<n){
            a[i]=res[k];
            k++;
            i++;
        }
        j=0;
        while(j<m){
            b[j]=res[k];
            k++;
            j++;
        }
    }

}
