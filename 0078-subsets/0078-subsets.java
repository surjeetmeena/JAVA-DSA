class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        int index=0;
    List<Integer>temp=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        solve(ans,temp,index,nums);
      
      return ans;

    }
    void solve(List<List<Integer>>ans,List<Integer>temp,int index,int []nums){
        if(index>=nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        solve(ans,temp,index+1,nums);
        
        temp.remove(temp.size()-1);
        solve(ans,temp,index+1,nums);


    }
}