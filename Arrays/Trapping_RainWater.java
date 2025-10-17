import java.util.*;
class Solution {
    public int trap(int[] height) {

        // 1st approach ( prefix array)

    /*  int n=height.length;
        int[]Lmax=new int[n];
        int[]Rmax=new int[n];

        Lmax[0]=height[0];
        Rmax[n-1]=height[n-1];

        for(int i=1; i<n;i++){
            Lmax[i]= Math.max(Lmax[i-1],height[i]);
        }

        for(int i=n-2; i>=0;i--){
            Rmax[i]=Math.max(Rmax[i+1],height[i]);
        }

        int ans=0;
        for(int i=0; i<n; i++){
            ans+=(Math.min(Lmax[i],Rmax[i]))-height[i];
        } 

        return ans;   
    }*/

    //2nd approach (two pointer)
        int n=height.length;
        int Lmax=Integer.MIN_VALUE;
        int Rmax=Integer.MIN_VALUE;
        int ans=0;
        int l=0;
        int r=n-1;
        while(l<r){
            Lmax= Math.max(Lmax,height[l]);
            Rmax= Math.max(Rmax,height[r]);

            if(Lmax<Rmax){
                ans+=(Lmax-height[l]);
                l++;
            }else{
                ans+=(Rmax-height[r]);
                r--;
            }
        }
        return ans;
    }
}
