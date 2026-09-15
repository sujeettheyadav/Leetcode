class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        int psum=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            psum+=nums[i];
            int rem=psum%k;
            if(rem==0 && i>=1)  return true;
            if(map.containsKey(rem)){
                int idx=map.get(rem);
                if(i-idx>=2) {
                    return true;
                }   
            }
            else{
                 map.put(rem,i);

            }
               
        }
        return false;
        
    }
}