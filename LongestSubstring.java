class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l =0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        for(int r=0;r<n;r++){
            while (set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLength = Math.max(maxLength,r-l+1);
        }
        return maxLength;
    }
}
