class Solution {
    public int largestAltitude(int[] gain) {
        int max=0;
        int i=0;
        int ans[]=new int[gain.length+1];
        ans[0]=0;
        int j=1;
        while(i<gain.length){
            ans[j]=ans[j-1]+gain[i];
            max=Math.max(max,ans[j]);
            i++;
            j++;
            
        }
        return max;
        
    }
}