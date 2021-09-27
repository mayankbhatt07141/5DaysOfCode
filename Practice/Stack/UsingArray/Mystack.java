package Practice.Stack.UsingArray;

public class Mystack {
    int a[];
    int top;
    int capacity;
    public Mystack(int capacity){
        this.capacity=capacity;
        top=-1;
        a=new int[capacity];
    }
    //push in stack;
    void push(int data){
        if(top==capacity-1){
            System.out.println("Stack overflow");
            return ;
        }
        top++;
        a[top]=data;
    }

    //pop in stack;
    int pop(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return a[top--];
    }

    //peek to see the top element
    int peek(){
        if(top==-1){
            System.out.println("stack underflow");
            return -1;
        }
        return a[top];

    }


    public static void main(String[] args) {
        Mystack s=new Mystack(5); //stack of array length 5
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println(s.pop());
    }
}
