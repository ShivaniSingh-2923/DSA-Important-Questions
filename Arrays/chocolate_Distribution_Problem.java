// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        //our intuition is the smallest difference between largest
        // and smallest value in m size array.
        int n=arr.size();
        int result=Integer.MAX_VALUE;
        
        //1. sort the array
        Collections.sort(arr);
        // loop from i=0; i<n-m+1;
        for(int i=0; i<n-m+1;i++){
            int min=arr.get(i); //minimum value
            int max=arr.get(i+m-1); // maximum value
            result= Math.min(result, max-min); // comparison with our result values everytime, and return minimum value
        }
        return result;
    }
}
