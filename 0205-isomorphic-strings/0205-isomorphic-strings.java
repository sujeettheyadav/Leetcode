class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1=new HashMap<>();
        HashMap<Character,Character> map2=new HashMap<>();
        int i=0;
        while(i<s.length()){
            char a=s.charAt(i);
            char b=t.charAt(i);
            if(map1.containsKey(a) && map1.get(a)!=b){
                return false;
            }
            if(map2.containsKey(b) && map2.get(b)!=a){
                return false;
            }
            map1.put(a,b);
            map2.put(b,a);
            i++;

        }
        return true;       
    }
}