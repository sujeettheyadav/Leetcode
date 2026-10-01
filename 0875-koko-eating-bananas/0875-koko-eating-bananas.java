class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int min=1;
        int max=0;
        for(int num:piles){
            max=Math.max(max,num);
        }
        int  low=min;
        int high=max;
        while(low<high){
            int mid=low+(high-low)/2;
            //int dayneeded=1;
            int totalhrs=0;
            for(int i=0;i<piles.length;i++){
                totalhrs += (piles[i] + mid - 1) / mid;
            }
            if(totalhrs<=h){
                high=mid;
            }
            else{
                low=mid+1;
            }
        }
        return low;    
    }
}