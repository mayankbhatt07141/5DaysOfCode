package Day14;

import java.util.Stack;

public class Day14 {
    public static void main(String[] args) {
        Stack<Integer> s=new Stack<Integer>();
        s.add(6);
        s.add(0);
        s.add(3);
        System.out.println(sort(s));
    }
    public static Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		Stack<Integer> tempstack=new Stack<Integer>();
		int temp;
		while(!s.isEmpty()){
		    temp=s.pop();
		    while(!tempstack.isEmpty() && tempstack.peek()>temp){
		        s.push(tempstack.pop());
		    }
		    tempstack.push(temp);
		}
		return tempstack;
	}
}
