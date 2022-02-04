/**
 * Problem Description :-
 * Given a string s, return true if it is a palindrome, or false otherwise.
 *
 */

public class ValidPalindrome {

        public boolean isPalindrome(String s) {
            if(s.length() == 0) return true;

            s = s.replaceAll("[^a-zA-Z0-9]",""); // will replace all the occurences of non alpha numeric characters with empty string

            s = s.toLowerCase();


            if(s.length() == 0) return true;

            int total_length = s.length() - 1;


            for(int i = 0;i<=s.length()/2;i++){
                if(s.charAt(i) !=  s.charAt(total_length - i)){
                    return false;
                }
            }

            return true;
        }



}


