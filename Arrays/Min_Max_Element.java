class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {
        // code Here
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
                
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
                
            }
        }
        ans.add(min);
        ans.add(max);
        return ans;
        
    }
}
