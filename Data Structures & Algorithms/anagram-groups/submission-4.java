class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
         HashMap<String, List<String>> map = new HashMap<>();

         for(String str : strs){
            char[] s = str.toCharArray();
            //sort s   1.sort
            Arrays.sort(s);
            //new string which is key for hashmap 2. create key
            String key = new String(s);
            // 3. check key inhash map (if not add and put new hash map
            if(map.containsKey(key)){
                map.get(key).add(str);
            }//if
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(key, list);
                //what do i add here
            }//else
         }//for each
         return new ArrayList(map.values());//help with this
    }
}
