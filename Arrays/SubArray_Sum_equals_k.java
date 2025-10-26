class Solution {
    public int subarraySum(int[] nums, int k) {
        int  n=nums.length;
        Map<Integer,Integer> m=new HashMap<>();
        m.put(0,1);

        int count=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];

            if(m.containsKey(sum-k)){
                count += m.get(sum - k);
            }
            m.put(sum, m.getOrDefault(sum, 0) + 1);
            //Add the current prefix sum to the map.
            //If it already exists, increment its count;
            //otherwise, set it to 1
        }
        return count;
        
    }
}
