class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if (n <= 1) return;

        // Step 1: find the first index i from right such that nums[i] < nums[i + 1]
        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        // Step 2: if such i exists, find j (from the right) where nums[j] > nums[i]
        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }

        // Step 3: reverse the subarray from i + 1 to end
        reverse(nums, i + 1, n - 1);
    }

    // reverse part of array
    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    // swap two elements safely
    public static void swap(int[] nums, int i, int j) {
        if (i >= 0 && j >= 0 && i < nums.length && j < nums.length) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
    }
}
