class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ans=new ArrayList<>();
        if(p.length()>s.length()) return new ArrayList<>();
        int freqp[]=new int[26];
        for(int i=0;i<p.length();i++){
            freqp[p.charAt(i)-'a']++;
        }
        int i=0;
        int freqs[]=new int[26];
        for(int j=0;j<p.length();j++){
            freqs[s.charAt(j)-'a']++;
        }
        if(Arrays.equals(freqp,freqs)) ans.add(i);
        for(int j=p.length();j<s.length();j++){
            freqs[s.charAt(j)-'a']++;
            freqs[s.charAt(i)-'a']--;
            i++;
            if(Arrays.equals(freqp,freqs)) ans.add(i);
        }
        return ans;
    }
}