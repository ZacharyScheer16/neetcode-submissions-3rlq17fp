class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;

        //select position and time //cols of 2 for position and time col 1 is position
        double[][] cars = new double [n][2]; 

        for(int i =0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = (double)(target - position[i])/speed[i];
        }

        Arrays.sort(cars, (a,b) -> Double.compare(b[0], a[0]));

        int fleet = 0;
        double currentSlowTime = 0;

        for(int i =0; i < n; i++){
            double time = cars[i][1];

            if(time > currentSlowTime){
                fleet++;
                currentSlowTime = time;
            }
        }
        return fleet;
    }
}
