class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freqs1[]=new int[26];
        if(s1.length()>s2.length()) return false;
        for(int i=0;i<s1.length();i++){
            freqs1[s1.charAt(i)-'a']++;
        }
        int freqs2[]=new int [26];
        for(int i=0;i<s1.length();i++){
            freqs2[s2.charAt(i)-'a']++;
        }
        int j=0;
        if(Arrays.equals(freqs1,freqs2)) return true;
        for(int i=s1.length();i<s2.length();i++){
            freqs2[s2.charAt(i)-'a']++;
            freqs2[s2.charAt(j)-'a']--;
            j++;
            if(Arrays.equals(freqs1,freqs2)) return true;
        }
        return false;  
    }
}