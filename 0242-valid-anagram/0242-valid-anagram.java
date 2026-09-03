class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[]=s.toCharArray();
        char t1[]=t.toCharArray();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(int i=0;i<s1.length;i++){
            map1.put(s1[i],map1.getOrDefault(s1[i],0)+1);
        }
        HashMap<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<t1.length;i++){
            map2.put(t1[i],map2.getOrDefault(t1[i],0)+1);  
        }
        if(map1.equals(map2))   return true; 
        return false;   
    }
    

    
}