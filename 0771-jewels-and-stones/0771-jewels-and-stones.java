class Solution {//optimal solution
    public int numJewelsInStones(String jewels, String stones) {
        int n=jewels.length();
        int m=stones.length();
        boolean arr[]=new boolean[256];
        int count=0;
        for(int i=0; i<n; i++){
        arr[jewels.charAt(i)]=true;
        }
        for(int j=0; j<m;j++){

        if(arr[stones.charAt(j)]){//agar j or i same hue to udar true value hogi to ye condition me inter kr lenge 
            count++;
        }
        }
        return count;
    }
}