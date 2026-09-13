class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int i=0;
        int length=0;
        //int ch=s.charAt(i);
        //int 
        for(int j=0;j<s.length();j++){
            while(set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                
                //length=Math.max(length,j-i+1);
                i++;

            }
            set.add(s.charAt(j));
            length=Math.max(length,j-i+1);

        }
        return length;
        
    }
}