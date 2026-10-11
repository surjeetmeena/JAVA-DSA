class Solution {//basic but time taking not optimal
    public String mergeAlternately(String word1, String word2) {
        int len1=word1.length();
        int len2=word2.length();

        char arr[]=new char [len1+len2];
        int i=0;
        int k=0;
        while(i<len1&&i<len2){
            arr[k++]=word1.charAt(i);
            arr[k++]=word2.charAt(i);
            i++;
        }
        while(i<len1){
            arr[k++]=word1.charAt(i);
            i++;
        }
        while(i<len2){
            arr[k++]=word2.charAt(i);
            i++;
        }

        
        return String.valueOf(arr);
    }
}