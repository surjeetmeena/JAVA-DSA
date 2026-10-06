class Solution {//thik thak
    public boolean isAnagram(String s, String t) {
        int n=s.length();
        int m=t.length();
        if(s==null&&t==null){
            return false;

        }
        
        if(m!=n){
            return false;
        }
        int fre[]=new int[26];


        for(int i=0; i<s.length(); i++){
            
            fre[s.charAt(i)-'a']++;
            fre[t.charAt(i)-'a']--;


        }
        for(int i=0; i<fre.length; i++){
            if(fre[i]!=0){
                return false;
            }
        }
        return true;
    }
}