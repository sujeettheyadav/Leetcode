class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int tsum=0;
        for(int i=0;i<cardPoints.length;i++){
            tsum+=cardPoints[i];
        }
        int n=cardPoints.length;
        int wsize=n-k;
        int wsum=0;
        int p=0;
        int j=0;
        int max=0;
        while(j<wsize){
            wsum+=cardPoints[j];
            j++;    
        }
        int rsum=tsum-wsum;
        max=Math.max(max,rsum);
        while(j<n){
            wsum+=cardPoints[j];
            wsum-=cardPoints[p];
            p++;
            j++;
            rsum=tsum-wsum;
            max=Math.max(max,rsum);
            
        }
        return max;

    }
}