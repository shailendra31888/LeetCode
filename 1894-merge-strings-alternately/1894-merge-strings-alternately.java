class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder ans =new StringBuilder("");
        int n = word1.length();
        int m = word2.length();
        if(n==m){
            for(int i=0;i<n;i++){
            ans.append(word1.charAt(i)); // Append character from word1
            ans.append(word2.charAt(i));
            }
        }
        else{
            if(n>m){
                for(int i=0;i<m;i++){
                ans.append(word1.charAt(i)); // Append character from word1
                ans.append(word2.charAt(i));
                }
                for(int i=m;i<n;i++){
                ans.append(word1.charAt(i));
                }
            }

            
            else{
                for(int i=0;i<n;i++){
                ans.append(word1.charAt(i)); // Append character from word1
                ans.append(word2.charAt(i));
                }
                for(int i=n;i<m;i++){
                ans.append(word2.charAt(i));
                }

            }
        }
        return ans.toString();
        
    }
}