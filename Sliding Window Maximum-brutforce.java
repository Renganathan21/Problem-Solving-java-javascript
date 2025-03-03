class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
         List<Integer> maxElement = new ArrayList<>();
        int left = 0,right = k-1;
        while(right<nums.length){
            int max = Integer.MIN_VALUE;
            for(int i = left; i<=right ; i++){
                max = Math.max(max, nums[i]);

            }
            maxElement.add(max);
            left++;
            right++;
        }

        return maxElement.stream().mapToInt(i -> i).toArray();



        
    }
}
