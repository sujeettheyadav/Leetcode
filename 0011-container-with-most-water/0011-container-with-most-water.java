class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max=0;
        while(left<right){
            int width=right-left;
            int minheight=Math.min(height[left],height[right]);
            int area=width*minheight;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            max=Math.max(area,max);
        }
        System.gc();
        return max;

    }
}