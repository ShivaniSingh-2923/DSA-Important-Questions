class Solution {
    public int search(int[] nums, int target) { 
        int left = 0, right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1; // search left half
                } else {
                    left = mid + 1; // search right half
                }
            } 
            // Otherwise, right half must be sorted
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1; // search right half
                } else {
                    right = mid - 1; // search left half
                }
            }
        }
        return -1;
        
        
    }
}
