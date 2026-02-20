package Stack;

import java.util.Scanner;
import java.util.Stack;

public class removeAtBottom {

    public static void removeAtAnyIndex(Stack<Integer> st,int idx){
//        1 based indexing
        if(st.size() == idx){
           st.pop();
           return ;
        }
        int top  = st.pop();
        removeAtAnyIndex(st,idx);
        st.push(top);

    }
    public static  void displayStack(Stack<Integer>st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayStack(st);
        System.out.print(top + " ");
        st.push(top);

    }

    public static void removeBottom(Stack<Integer> st ){
        if(st.size()==1){
            int x  = st.pop();
            System.out.println("\nBottom Element: "+x+" Removed from stack");
            return ;
        }
        int top = st.pop();
        removeBottom(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
//        Take input from user
        System.out.print("Enter size of stack: ");
        int size = sc.nextInt();
        int i = 1;
        System.out.println("Enter the "+ size +" elements of the stack: ");
        while(i <= size){
            int top = sc.nextInt();
            st.push(top);
            i++;
        }
        System.out.print("Input Stack: ");
        displayStack(st);
//        removeBottom(st);


        System.out.print("\nEnter index to remove element: ");
        int idx = sc.nextInt();

        removeAtAnyIndex(st,idx);
        System.out.print("Output Stack: ");
        displayStack(st);

    }
}
