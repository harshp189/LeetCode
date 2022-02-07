/**
 * Problem Description :-
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
 * determine if the input string is valid.
 *
 */

import java.util.*;

public class ValidParantheses {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '{' || c == '[' || c == '('){
                st.push(c);
            }
            else if(c == ']'){
                boolean flag = checkParantheses(st,'[');
                if(flag == false){
                    return flag;
                }
            }else if(c == ')'){
                boolean flag = checkParantheses(st,'(');
                if(flag == false){
                    return flag;
                }
            }else if(c == '}'){
                boolean flag = checkParantheses(st,'{');
                if(flag == false){
                    return flag;
                }
            }
        }

        if(st.size() == 0) {
            return true;
        }else{
            return false;
        }

    }

    public boolean checkParantheses(Stack<Character> st, Character c){
        if(st.size() == 0){
            return false;
        }else if(st.peek() != c){
            return false;
        }else{
            st.pop();
            return true;
        }
    }
}