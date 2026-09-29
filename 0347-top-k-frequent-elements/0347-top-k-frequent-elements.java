class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //ArrayList<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int index[][]=new int[map.size()][2];
        int j=0;
        for(int i:map.keySet()){
            index[j][0]=i;
            index[j][1]=map.get(i);
            j++;
        }
        Arrays.sort(index, (a, b) -> b[1] - a[1]);
        int ans[]=new int[k];
        for(int i=0;i<k;i++){
            ans[i]=index[i][0];
        }
        return ans; 
    }
}