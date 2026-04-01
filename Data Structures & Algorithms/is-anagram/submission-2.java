class Solution {
    public boolean isAnagram(String s, String t) {
        //base case
        //two inputs of string
        //return boolean
        //check if every letter is same, doesnt matter order
        if(s.length() != t.length()){
            return false;
        }
        char[] sToCharArray = s.toCharArray();
        char[] tTopCharArray= t.toCharArray();
        
        Arrays.sort(sToCharArray);
        Arrays.sort(tTopCharArray);
        // Arrays.equals() compares the content of the two arrays.
        return Arrays.equals(sToCharArray, tTopCharArray);

    }
}