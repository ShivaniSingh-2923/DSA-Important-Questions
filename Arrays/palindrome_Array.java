/*Complete the Function below*/
class Solution {
    public static boolean checkPalindrome(int a){
        String s=Integer.toString(a);
        int n=s.length();
        boolean flag=true;
        for(int i=0;i<n/2;i++){
            if(s.charAt(i)!=s.charAt(n-1-i)){
                flag=false;
                break;
            }
        }
        return flag;
    }
    public static boolean isPalinArray(int[] arr) {
        int length=arr.length;
        for(int i=0;i<length;i++){
            if(!checkPalindrome(arr[i])){
                return false;
            }
        }
        return true;
    }
}
