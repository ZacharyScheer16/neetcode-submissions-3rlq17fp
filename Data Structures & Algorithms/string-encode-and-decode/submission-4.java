class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        //for reach loop to oterate through list
        for(String s: strs){
            sb.append(s.length()).append('<').append(s);
        }

        return sb.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        int i =0;
        //for/while loop {}

        while(i < str.length()){
        int j = i + 1;
        while(str.charAt(j) != '<'){
            j++;
        }

        int length = Integer.parseInt(str.substring(i,j));
        String currWord = str.substring(j + 1, length + j + 1);

        result.add(currWord);
        i = length + j + 1;
        }

        return result;

    }
}
