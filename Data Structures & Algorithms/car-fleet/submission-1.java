

class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        // Step 1: create index array
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Step 2: sort indices by position descending
        Arrays.sort(indices, (a, b) -> position[b] - position[a]);

        int fleets = 0;
        double lastTime = 0;

        // Step 3: normal for loop over sorted indices
        for (int i = 0; i < n; i++) {
            int idx = indices[i];

            double time = (double)(target - position[idx]) / speed[idx];

            if (time > lastTime) {
                fleets++;
                lastTime = time;
            }
        }

        return fleets;
    }
}