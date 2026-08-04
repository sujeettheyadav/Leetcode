class Solution {
    public int[] replaceElements(int[] arr) {
        
        int max=-1;
        
        for(int cur=arr.length-1;cur>=0;cur--){
            int temp=arr[cur];
            arr[cur]=max;

            if(temp>max){
               
                max=temp;

            }
        }
        return arr;
    }
}