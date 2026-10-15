class Solution {//not optimal 
    public String reverseWords(String s) {
        //int len=s.length();
        s=s.trim();
        String arr []=s.split("\\s+");
        int left=0;
        int right=arr.length-1;
        while(left<right){

            String temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return   String .join(" ",arr);
        
    }
}