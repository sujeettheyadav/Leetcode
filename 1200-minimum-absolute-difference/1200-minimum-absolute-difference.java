class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        
        Arrays.sort(arr);
        int min=arr[1]-arr[0];
        
        for(int i=2;i<arr.length;i++){
            int diff=arr[i]-arr[i-1];
            min=Math.min(min,diff);


        }
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<arr.length;i++){
            if(arr[i]-arr[i-1]==min){
                List<Integer> pair=new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                ans.add(pair);
            }
        }
        return ans;

        
        
    }
}