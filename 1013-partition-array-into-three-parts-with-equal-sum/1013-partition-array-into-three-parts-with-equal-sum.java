class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int tsum=0;
        for(int i=0;i<arr.length;i++){
            tsum+=arr[i];
        }
        if(tsum%3!=0) return false;
        int sum3=tsum/3;
        int psum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            psum+=arr[i];
            if(psum==sum3){
                count++;
                psum=0;
            }


        }
        if(count>=3){
            return true;
        }
        else{
            return false;
        }
    }
}