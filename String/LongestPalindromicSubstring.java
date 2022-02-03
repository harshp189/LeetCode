/**
 * Problem Description :-
 * Given a string s, return the longest palindromic substring in s.
 *
 */
public class LongestPalindromicSubstring {

        public String longestPalindrome(String s) {
            if(s==null || s.length() < 1) return "";

            int start=0;
            int end=0;

            for(int i=0;i<s.length();i++){
                int len1 = expandFromMiddle(s,i,i);
                int len2 = expandFromMiddle(s,i,i+1);
                int len = Math.max(len1,len2);
                if(len>end-start){
                    start = i - ((len - 1 ) / 2);  // to retrieve the new position of start in order to return the new larger palindromic substring
                    end = i + (len/2);
                }
            }

            return s.substring(start,end+1);
        }

        public int expandFromMiddle(String s, int left,int right){
            if(s==null || left>right) return 0;

            while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)){
                left--;
                right++;
            }

            return right-left-1;
        }
    }

