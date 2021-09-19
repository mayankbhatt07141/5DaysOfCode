package Practice.Trailingzeros;

public class Trails {
    public static void main(String[] args) {
        int n=100;
        System.out.println(trailzero(n));
    }
    static int trailzero(int n){
        int count=0;
        int p=5;
        while((n/p)>0){
            count+=n/p;
            p*=5;
        }
        return count;
    }
    
}
