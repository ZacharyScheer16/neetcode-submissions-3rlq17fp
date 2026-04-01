class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
            }
            int[] arr1 = {1,2,3,4};
            System.out.println(arr1);

        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();

        Arrays.sort(ss);
        Arrays.sort(tt);

        if( Arrays.equals(ss,tt)){
            return true;
        }
        //return boolean
        return false;
    }
}
