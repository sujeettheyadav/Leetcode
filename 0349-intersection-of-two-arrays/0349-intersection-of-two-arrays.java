class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet <Integer> set1=new HashSet<>();
        for(int num:nums1){
            set1.add(num);
        }
        HashSet <Integer> set2=new HashSet<>();
        for(int num:nums2){
            set2.add(num);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        for(int num:set2){
            if(set1.contains(num)){
                ans.add(num);
            }
        }
        int result[]=new int[ans.size()];
        for(int i=0;i<ans.size();i++){
            result[i]=ans.get(i);
        }
        return result;

        
    }
}