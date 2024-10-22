class Solution {
    public boolean canConstruct(String a, String b) {
	char[] c= b.toCharArray();
		char[] aa= a.toCharArray();
		
		int k=0;
		for(int i=0;i<a.length();i++){
            for(int j=0;j<b.length();j++){
            if(aa[i]==c[j]){
                c[j]='0';
                aa[i]='1';
                k++;

            }
            }
        }
        if(k==a.length()){
            return true;
        }
        return false;
            
        

    }
}