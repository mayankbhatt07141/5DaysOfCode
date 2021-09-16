import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class NmeetingRoom{
    public static void main(String[] args){
        int[] start={1,3,0,5,8,5};
        int [] end={2,4,6,7,9,9};
        int n=6;
        System.out.println(maxMeetings(start, end, n));
    }
    public static int maxMeetings(int start[], int end[], int n)
    {
        
        ArrayList<meeting> meet=new ArrayList<meeting>();
        for(int i=0;i<n;i++)
        meet.add(new meeting(start[i],end[i],i+1));
        
        meetingcomparator mc=new meetingcomparator();
        Collections.sort(meet,mc);
        
        int count=1;
        int x=meet.get(0).end;
        for(int i=1;i<n;i++){
            
            if(x<meet.get(i).start){
                count++;
                x=meet.get(i).end;
            }
           
        }
        return count;
    }
}
class meeting{
    int start;
    int end;
    int pos;
   meeting(int start, int end, int pos) {
        this.start=start;
        this.end=end;
        this.pos=pos;
    }
}
  class meetingcomparator implements Comparator<meeting>{
   
    public int compare(meeting m1,meeting m2){
        if(m1.end<m2.end){
            return -1;
        }
        else if(m1.end>m2.end){
            return 1;
        }
        else if(m1.pos<m2.pos){
            return -1;
        }
        return 1;
    }
}