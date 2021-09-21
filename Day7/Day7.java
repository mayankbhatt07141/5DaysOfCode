package Day7;
public class Day7 {
    public static void main(String[] args) {
        int height[]={2, 1, 3, 4, 6, 5};
        int n=6;
        System.out.println(maxCandy(height, n));
    }
    static int maxCandy(int height[],int n){
        int maxarea=0;
        int area=0;
        int start=0;
        int end=n-1;
        for(int i=0;i<n;i++){
            area=Math.min(height[start], height[end])*(end-start-1);
            maxarea=Math.max(area, maxarea);
            if(height[start]<height[end]){
                start++;
            }
            else{
                end--;
            }
        }
        return maxarea;
    }
}
