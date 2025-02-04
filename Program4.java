class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        Map<Character,Integer> charcount = new HashMap<>();

        for(char c : s.toCharArray()){
            charcount.put(c,charcount.getOrDefault(c,0)+1);
        }

        for(char c : t.toCharArray()){
            if(!charcount.containsKey(c)){
                return false;
            }
            charcount.put(c,charcount.getOrDefault(c,0)-1);
            if(charcount.get(c) == 0){
                charcount.remove(c);
            }
        }
        return charcount.isEmpty();

    }
}
