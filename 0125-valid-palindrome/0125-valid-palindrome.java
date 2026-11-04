class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
       return chak(s,left,right);
    }
    static boolean chak(String s,int left,int right){
        if(left>=right){
            return true;
        }
       // while(left<right){

            while(left<right&&!Character.isLetterOrDigit(s.charAt(left))){
                left++;
            }
            while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
                right--;
            }
            if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
                return false;
            }
      //  }
        return chak(s,left+1,right-1);

    }
}