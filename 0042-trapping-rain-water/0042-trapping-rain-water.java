class Solution {
    public int trap(int[] height) {
        int n=height.length-1;
        int lmax=0;
        int rmax=0;
        int sum=0;
        int l=0;
        int r=n;
        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                sum+=lmax-height[l];
                l++;
            }
            else{
                sum+=rmax-height[r];
                r--;
            }
        }
        return sum;
        
    }
}