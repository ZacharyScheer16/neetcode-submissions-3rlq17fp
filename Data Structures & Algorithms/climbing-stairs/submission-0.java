class Solution {
    public int climbStairs(int n) {
        if(n <= 2) return n;

        int firstStep = 1;
        int secondStep =2;

        int current = 0;

        for(int i =3; i <= n; i++){
            current = firstStep + secondStep;
            firstStep = secondStep;
            secondStep = current;
        }

        return current;
    }
}
