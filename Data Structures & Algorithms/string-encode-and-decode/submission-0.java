class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();

        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }

        return sb.toString();
        
    }   

    public List<String> decode(String str) {
        List<String> key = new ArrayList<>();
        int i =0;
        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }
            //once we reach # ..
            //extract length
            int length = Integer.parseInt(str.substring(i,j));
            j++; //skip #

            String keyWord = str.substring(j, j+length );
            key.add(keyWord);
            i = j+length;
        }

       return key;
    }
    
}
