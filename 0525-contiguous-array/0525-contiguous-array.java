class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer,Integer>map=new HashMap<>();
        int sum=0;
        //int i=0;
        map.put(0,-1);
        int max=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]==0){
                sum--;
            }
            else{
                sum++;
            }
            if(map.containsKey(sum)){
                int idx=map.get(sum);
                max=Math.max(max,j-idx);
            }
            else{
                map.put(sum,j);
            }    
        }
        return max;   
    }
}