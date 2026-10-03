class Solution {//accha question h
    public boolean isIsomorphic(String s, String t) {
        int ss[]=new int[256];
        int tt[]=new int[256];
        for(int i=0; i<s.length(); i++){
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(ss[s1]!=tt[t1]){
                return false;
            }else{
                ss[s1]=i+1;
                tt[t1]=i+1;
            }
        }
        return true;
    }
}