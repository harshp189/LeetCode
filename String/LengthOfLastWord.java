/**
 * Problem Description :-
 * Given a string s consisting of some words separated by some number of spaces, return the length of the last word in the string.
 *
 * A word is a maximal substring consisting of non-space characters only.
 *
 */


public class LengthOfLastWord {

        public int lengthOfLastWord(String s) {
            s = s.trim(); //to remove the leading and trailing from the string (i.e  "   hello world  " will become "hello world")
            int lastIndex = s.lastIndexOf(" ");
            String substring = s.substring(lastIndex + 1,s.length());
            return substring.length();
        }

}
