package Practice.Stack.UsingArrayList;

import java.util.ArrayList;



public class MyStack {
    ArrayList<Integer> a=new ArrayList<Integer>();   

    void push(int data){
        a.add(data);
    }
    int pop(){
        int top=a.get(a.size()-1);
        a.remove(a.size()-1);
        return top;
    }
    int peek(){   // to see the top of the stack
        return (a.get(a.size()-1));
    }

    public static void main(String[] args) {
        MyStack sta=new MyStack();
        sta.push(1);
        sta.push(2);
        sta.push(3);
        sta.push(4);
        sta.push(5);
        System.out.println(sta.pop());
        System.out.println(sta.pop());
    }
}
