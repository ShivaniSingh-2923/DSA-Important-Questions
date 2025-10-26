class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int maxArea=0;
        while(l<r){
            int area=(r-l)*Math.min(height[l],height[r]);
            maxArea=Math.max(maxArea,area);
            if(height[l]>height[r]){
                r--;
            }else{
                l++;
            }

        }
        return maxArea;
    }

    //If we move the taller line r to r-1, the width decreases, but the height cannot increase (it’s still limited by the shorter line height[l]). So area cannot increase.

//If we move the shorter line l to l+1, maybe we find a taller line, increasing the minimum height and potentially increasing the area.

 //That’s why we always move the pointer pointing to the shorter line.
}
