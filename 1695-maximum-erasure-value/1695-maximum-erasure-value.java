class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int i=0;
        int sum=0;
        int max=0;
        for(int j=0;j<nums.length;j++){
            //int sum=0;
            while(set.contains(nums[j])){
                set.remove(nums[i]);

                sum-=nums[i];
                i++;
            }
            set.add(nums[j]);
            sum+=nums[j];
            max=Math.max(max,sum);
        }
        return max;
        
    }
}