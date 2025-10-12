import java.util.*;
class Solution {
    public int findKthLargest(int[] nums, int k) {

        //approach 1- by using priorityqueue;

        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:nums){
            pq.add(i);
            if(pq.size()>k){
                pq.poll(); //remove the smallest number
            // everytime the heap has more than k elements, we remove the smallest,
            // so the heap only keeps the k largest element.
            }
        }
        return pq.peek(); //min-heap=greater(bottom) to smaller(top)[root=min]

        // approach 2 - by sorting

 /*       int n=nums.length;
        Arrays.sort(nums);
        return nums[n-k]; */
    }
}
