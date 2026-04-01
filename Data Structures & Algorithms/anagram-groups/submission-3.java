class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
            //key   //Original Word
        // ex: <opst, [post, tops, stop]    
        HashMap<String, List<String>> map = new HashMap<>();


        //for loop (enhanced) string s in strs
        for(String s : strs){
        //1. strip word 
        char[] charWord = s.toCharArray();
        //2. sort the word via char array
        Arrays.sort(charWord);
        // 3. create a key word ex: opst
        String key = new String(charWord);

        //4. check if word does not (key) is in map
        if(!map.containsKey(key)){
            map.put(key, new ArrayList<String>());
        }
        // add to list
        map.get(key).add(s);
        }
        //return map.get()
        return new ArrayList<>(map.values());
    }
}
