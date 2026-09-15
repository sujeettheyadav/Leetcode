class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int psum=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%2==0){
                psum+=0;
            }
            else{
                psum+=1;
            }
            if(map.containsKey(psum-k)){
                count+=map.get(psum-k);
            }
            map.put(psum, map.getOrDefault(psum, 0) + 1);
        }
        return count;   
    }
}