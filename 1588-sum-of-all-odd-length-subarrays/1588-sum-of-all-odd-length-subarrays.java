class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            int ways=(i+1)*(arr.length-i);
            int odd=(ways+1)/2;
            sum+=arr[i]*odd;
        }
        return sum;
        
    }
}