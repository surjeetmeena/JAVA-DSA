class Solution {//recursion wow must do it again
    public static void sol(List<List<Integer>>ans,List<Integer>temp,int[]nums,int index){
        if(index==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        sol(ans,temp,nums,index+1);
        temp.remove(temp.size()-1);
        sol(ans,temp,nums,index+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer>temp=new ArrayList<>();
        int index=0;
        sol(ans,temp,nums,index);
        return ans;
    }
}