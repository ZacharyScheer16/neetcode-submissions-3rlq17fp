class Solution {
    public boolean isAnagram(String s, String t) {
        // order doestn matter a way to compare could be order array (ort) and compare
        //convert str to array:
        //ex: racecar and t = carrace
        //aaccer
        char[] st = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(st);
        //aaccer
        Arrays.sort(ts);

        return Arrays.equals(st, ts);

    }
}
