class Solution {

    public void helper(int[]nums,int idx,List<List<Integer>>ans ,HashSet<List<Integer>> set){
        int n=nums.length;
        if(idx==n-1){
            List<Integer> l=new ArrayList<>();
            for(int i=0;i<n;i++){
                l.add(nums[i]);
            }
            if (!set.contains(l)) {
                ans.add(new ArrayList<>(l));
                set.add(l);
            }
            return;
            
        }

        for(int j=idx;j<n;j++){
            swap(j,idx,nums);
            helper(nums,idx+1,ans,set);
            swap(j,idx,nums);
        }
    }

    public void swap(int i,int j, int[]nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        HashSet<List<Integer>> set =new HashSet<>();
        helper(nums,0,ans,set);
        return ans;
        
    }
}
