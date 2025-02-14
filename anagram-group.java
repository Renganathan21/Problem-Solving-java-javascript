class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String,List<String>>m = new HashMap<>();
        for(String s:strs){
            char ch[] = s.toCharArray();
            Arrays.sort(ch);
            String s1 = String.valueOf(ch);
            if(!m.containsKey(s1)){
                m.put(s1, new ArrayList<>());
            }
            m.get(s1).add(s);

        } 
        return new ArrayList<>(m.values());
        
    }
}
