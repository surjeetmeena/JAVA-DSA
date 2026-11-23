class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right=s.length()-1;
       return check(s,left,right);

    }
    public static boolean check(String s,int left,int right){
        if(left>=right){
            return true;
        }
        while(left<right&&!Character.isLetterOrDigit(s.charAt(left))){
            left++;
        }
        while(left<right&&!Character.isLetterOrDigit(s.charAt(right))){
            right--;
        }
        if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
            return false;
        }
        return check(s,left+1,right-1);

    }
}