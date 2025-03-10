class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if(n==0){
            return 0;
        }

        double[][] cars = new double[n][2];
        for(int i = 0;i<n;i++){
            cars[i][0] = position[i];
            cars[i][1] = (double) (target - position[i]) / speed[i]; 
        }

        Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
        Stack<Double> stack = new Stack<>();

        for(double[] car:cars){
            double time = car[1];
            if(stack.isEmpty() || time>stack.peek()){
                stack.push(time);            
                
            }

            
        }

        return stack.size();

    }
}
