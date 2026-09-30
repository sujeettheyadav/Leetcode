class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i:weights){
            low=Math.max(low,i);
            high+=i;
        }
        while(low<high){
            int mid=low+(high-low)/2;
            int sum=0;
            int dayneeded=1;
            for(int i:weights){
                if(sum+i>mid){
                    dayneeded++;
                    sum=0;
                }
                sum+=i;
            }
            if(dayneeded<=days){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}