class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s: strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }
            //extract length which is number
            int length= Integer.parseInt(str.substring(i,j));
            //extract current word
            String word = str.substring(j + 1, j + length + 1);

            result.add(word);
            i = j+length+1;
        }

        return result;
    }
}
