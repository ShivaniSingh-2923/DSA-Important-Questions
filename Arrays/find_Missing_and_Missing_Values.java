import java.util.*;
class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        //find repeated value;
        HashSet<Integer> set =new HashSet<>();
        int n=grid.length;
        int[]arr=new int[2];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                int val = grid[i][j];
                if (!set.add(val)) { // if already exists
                    arr[0] = val;    // repeated value
                }
            }
        }
        //find missing value;
        for (int i = 1; i <= n * n; i++) {
            if (!set.contains(i)) {
                arr[1] = i;  // missing value
                break;
            }
        }
        return arr;
    }

}
