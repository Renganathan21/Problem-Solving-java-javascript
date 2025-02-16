class Solution {

    public String encode(List<String> strs) {

        StringBuilder encode = new StringBuilder();
        for(String s: strs){
            encode.append(s.length()).append('#').append(s);
        }
        return encode.toString();


    }

    public List<String> decode(String str) {
        List<String> decodeList = new ArrayList<>();
        int i =0;
        while(i<str.length()){
            int speratorIndex = str.indexOf('#',i);
            int length = Integer.parseInt(str.substring(i,speratorIndex));
            String  decode = str.substring(speratorIndex+1,speratorIndex+1+length);
            decodeList.add(decode);
            i = speratorIndex+1+length;
        }
        return decodeList;

    }
}
