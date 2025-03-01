class Solution {
    public String minWindow(String s, String t) {
        if(t.length() > s.length()) return "";
        HashMap <Character,Integer> tfreq = new HashMap<>();
        for(char str:t.toCharArray()){
            tfreq.put(str,tfreq.getOrDefault(str,0)+1);
        }
        int left = 0; int right = 0 ;int minLen = Integer.MAX_VALUE;
        int startIdx = 0 ; int required = tfreq.size();int formed = 0;
        HashMap<Character,Integer> windowCount = new HashMap<>();
        while(right<s.length()){
            char c = s.charAt(right);
            windowCount.put(c,windowCount.getOrDefault(c,0)+1);
            if(tfreq.containsKey(c) && windowCount.get(c).intValue() == tfreq.get(c).intValue()){

                formed++;
            }

            while(left<=right && formed == required){
                if(right - left + 1 < minLen){
    minLen = right - left + 1;
    startIdx = left;
}

                char leftChar = s.charAt(left);
                windowCount.put(leftChar,windowCount.get(leftChar) - 1);
                if(tfreq.containsKey(leftChar) && windowCount.get(leftChar) < tfreq.get(leftChar)){
                    formed--;
                }
                left++;
                
            

            }
            right++;


        }
        return minLen == Integer.MAX_VALUE ? "":s.substring(startIdx,startIdx+minLen);
    }
}
