/**
 * Problem Description :-
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 *
 */




import java.util.*;

public class RemoveDuplicateLetters {


        public String removeDuplicateLetters(String s) {
            int[] lastIndex = new int[26];
            for(int i = 0;i<s.length(); i++){
                lastIndex[s.charAt(i) - 'a'] = i;
            }

            boolean[] seen = new boolean[26];
            Stack<Integer> st = new Stack();
            for(int i=0;i<s.length();i++){
                int c = s.charAt(i) - 'a';
                if(seen[c]) continue;
                while(!st.isEmpty() && st.peek() > c  && i < lastIndex[st.peek()]){
                    seen[st.pop()] = false;

                }

                st.push(c);
                seen[c] = true;
            }

            StringBuilder sb = new StringBuilder();
            while(!st.isEmpty())
                sb.append((char)(st.pop() + 'a'));
            return sb.reverse().toString();
        }

}
