class Solution {
    public int[][] merge(int[][] intervals) {
       //if length <= 1
       if(intervals.length <= 1)return intervals;
       
       //need to sort (ascending order)
       //Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       Arrays.sort(intervals, (a,b) -> a[0]- b[0]);

       List<int[]> result = new ArrayList<>();
       
        int[] current = intervals[0]; //[1,3]

        //iterate through
        for (int i = 1; i < intervals.length; i++){
            int[] next = intervals[i];

            //check overlap
            if(current[1] >= next[0]){
                current[1] = Math.max(current[1], next[1]);
            }else{
                //if no overlap you have to add
                result.add(current);

                //move on
                current = next;
            }
        }
        //add final interval
        result.add(current);

        return result.toArray(new int[result.size()][]);
        
    }
}
