package Stack;
import java.util.Stack;

public class pushAtBottomRecursion {

    public static void pushAtBottom(Stack<Integer> st , int ele){
        if(st.isEmpty()){
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,ele);
        st.push(top);
    }
    public static  void displayStack(Stack<Integer>st){
        if(st.isEmpty()) return;
        int top = st.pop();
        displayStack(st);
        System.out.print(top + " ");
        st.push(top);

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);

        int ele = 5;
        pushAtBottom(st,ele);
        displayStack(st);
    }
}
