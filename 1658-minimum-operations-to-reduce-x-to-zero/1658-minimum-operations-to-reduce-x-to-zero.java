class Solution {
    public int minOperations(int[] nums, int x) {
        int i=0;
        int n=nums.length;

        int winsum=0;
        int tsum=0;
        int min=Integer.MAX_VALUE;
        for(int k=0;k<n;k++){
            tsum+=nums[k];
        }
        if (tsum-x < 0) return -1;
        if (tsum-x == 0) return nums.length;
        for(int j=0;j<n;j++){
            winsum+=nums[j];
            while(winsum>tsum-x){
                winsum-=nums[i];
                i++;
            }
            if(winsum==tsum-x){
                min=Math.min(min,n-(j-i+1));
            }
        }
        if(min==Integer.MAX_VALUE) return -1;
        return min;
        
    }
}