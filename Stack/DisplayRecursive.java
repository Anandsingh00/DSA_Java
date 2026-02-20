package Stack;

import java.util.Stack;

public class DisplayRecursive {
    public static void displayReverseRecursive(Stack <Integer> st){
     //base case
        if(st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top + " ");
        displayRecursive(st);
        st.push(top);
    }
    public static void displayRecursive(Stack<Integer> st){
        if(st.isEmpty())return ;
        int top = st.pop();
        displayRecursive(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        displayRecursive(st);
        System.out.println();
        displayReverseRecursive(st);

    }
}
