package LeetCode.String.Easy;

public class Solution1768 {

    //https://leetcode.com/problems/merge-strings-alternately/description/
    public String mergeAlternately(String word1, String word2) {
        StringBuilder st = new StringBuilder();
        //st.setLength(0);
        if(word1.equals("")){
            return word2;
        }else if(word2.equals("")){
            return word1;
        }else{
            if(word1.length() < word2.length()){
                int k = 0;
                for (int i = 0; i < word1.length(); i++) {
                    st.append(word1.charAt(i));
                    st.append(word2.charAt(i));
                    k = i;
                }
                k++;
                while( k < word2.length()){
                    st.append(word2.charAt(k));
                    k++;
                }

            }else if(word2.length() < word1.length()){
                int k = 0;
                for (int i = 0; i < word2.length(); i++) {
                    st.append(word1.charAt(i));
                    st.append(word2.charAt(i));
                    k = i;
                }
                k++;
                while( k < word1.length()){
                    st.append(word1.charAt(k));
                    k++;
                }
            }else{
                for (int i = 0; i < word1.length(); i++) {
                    st.append(word1.charAt(i));
                    st.append(word2.charAt(i));
                }
            }

            return st.toString();
        }
    }
}
