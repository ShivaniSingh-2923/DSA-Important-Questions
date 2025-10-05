class Solution {  //using kadane's algorithm 
// with approach if current sum<0 then re-initialize the current_sum
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int maxSum=nums[0];
        int currentSum=0;
        for(int i=0; i<n; i++){
            currentSum+=nums[i];
            //kadane's intiution;
            if(currentSum>maxSum) maxSum= currentSum;
            if(currentSum<0) currentSum=0; // re-initialization.
        }
        return maxSum; 
        
    }
};
