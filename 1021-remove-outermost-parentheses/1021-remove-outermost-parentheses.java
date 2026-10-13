class Solution {//copy past almost
    public String removeOuterParentheses(String s) {
        int n=s.length();
        char ch[]=new char[n];
        int count=0;
        int j=0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='('){
                if(count>0){
                    ch[j]=s.charAt(i);
                    j++;
                }
                count++;
            }else{
                count--;
                if(count>0){
                    ch[j]=s.charAt(i);
                    j++;
                }
            }
        }
        return new String(ch,0,j);
    }
}