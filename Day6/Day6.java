package Day6;
import java.util.ArrayList;
import java.util.Collections;

public class Day6 {
    public static void main(String[] args) {
        System.out.println((factorial(5).toString().replaceAll("\\[|\\]\\", "").replaceAll(", ","")));

    }
    static ArrayList<Integer> factorial(int N){
        ArrayList<Integer> a=new ArrayList<Integer>();
        for(int i=1;i<=N;i++){
            int carry=0;
            int size=a.size();
            if(size==0){
                a.add(1);
                
            }
            else{
                for(int j=0;j<size;j++){
                    int prod=a.get(j)*i+carry;
                    a.set(j,prod%10);
                    carry=prod/10;
                }
                while(carry!=0){
                    a.add(carry%10);
                    carry=carry/10;
                }
            }
        }
        Collections.reverse(a);
        return a;
}
}
