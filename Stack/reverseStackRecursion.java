package Stack;
import java.util.Stack;

public class reverseStackRecursion {
    public static void reverseStack1(Stack<Integer> st){
        Stack<Integer> ft = new Stack<>();
        Stack<Integer> pt = new Stack<>();

        while(!st.isEmpty()){
            ft.push(st.pop());
        }

        while(!ft.isEmpty()){
            pt.push(ft.pop());
        }

        while(!pt.isEmpty()){
            st.push(pt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(11);
        st.push(12);
        st.push(13);
        st.push(14);

        System.out.print("Input Stack: "+st);
        System.out.println();
        reverseStack1(st);
        System.out.print("Output Stack: "+st);
    }
}
