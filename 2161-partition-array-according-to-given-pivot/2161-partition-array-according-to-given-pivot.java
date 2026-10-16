class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int result[]=new int[nums.length];
        int k=0;
        for(int x:nums){
            if(x<pivot) result[k++]=x;
        }
        for(int x:nums){
            if(x==pivot) result[k++]=x;
        }
        for(int x:nums){
            if(x>pivot) result[k++]=x;
        }
        return result;   
    }
}