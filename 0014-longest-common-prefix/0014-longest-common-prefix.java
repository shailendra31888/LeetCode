class Solution {
    public String longestCommonPrefix(String[] strs) {
        String c= strs[0];
        for(int i=1;i<strs.length;i++){
            c= common(c,strs[i]);
        }
        return c;
    }
public String common(String s1, String s2) {
    int n = Math.min(s1.length(), s2.length()); 
    int k = -1;

    // Iterate through both strings up to the minimum length
    for (int i = 0; i < n; i++) {
        if (s1.charAt(i) != s2.charAt(i)) {
            k = i;
            break; // Mismatch found, stop the loop
        }
    }

    // If no mismatch was found, return the whole prefix (from 0 to the min length of both strings)
    return k == -1 ? s1.substring(0, n) : s1.substring(0, k);
}

}