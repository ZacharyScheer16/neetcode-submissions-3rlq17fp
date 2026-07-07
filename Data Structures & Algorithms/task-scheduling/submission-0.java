class Solution {
    public int leastInterval(char[] tasks, int n) {
        // Count frequency of each task
        int[] freq = new int[26];
        for (char task : tasks) {
            freq[task - 'A']++;
        }

        // Find the highest frequency
        int maxFreq = 0;
        for (int f : freq) {
            maxFreq = Math.max(maxFreq, f);
        }

        // Count how many tasks have that highest frequency
        int numMax = 0;
        for (int f : freq) {
            if (f == maxFreq) {
                numMax++;
            }
        }

        // Build the schedule around the most frequent task(s)
        int intervals = (maxFreq - 1) * (n + 1) + numMax;

        // If enough other tasks fill all idle spots,
        // answer is simply the total number of tasks.
        return Math.max(intervals, tasks.length);
    }
}