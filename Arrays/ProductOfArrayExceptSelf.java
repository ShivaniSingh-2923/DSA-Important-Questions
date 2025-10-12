class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] ans= new int[n];
        // left traversal
        ans[0]=1; // no element before 0;
        for(int i=1;i<n; i++){
            ans[i]=ans[i-1]*nums[i-1];
        }

        // right traversal till end of the loop
        int rightAns=1;
        for(int i=n-1; i>=0; i--){
            ans[i] = ans[i] * rightAns;
            rightAns*=nums[i];
        }
        return ans;
    }
}
