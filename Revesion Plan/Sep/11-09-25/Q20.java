import java.util.*;

class CheckBalancedParentheses {
    public static void main(String[] args) {
        String s = "(()())";
        Stack<Character> st = new Stack<>();
        boolean balanced = true;
        for(char c: s.toCharArray()){
            if(c=='(') st.push(c);
            else if(c==')'){
                if(st.isEmpty()) { balanced=false; break; }
                st.pop();
            }
        }
        if(!st.isEmpty()) balanced=false;
        System.out.println(balanced);
    }
}
