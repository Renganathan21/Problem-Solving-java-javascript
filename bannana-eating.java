class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1 ; 
        int high = getMax(piles);

        while(low<high){
            int mid = low + (high - low)/2  ;
            if(canFinish(piles,mid,h)){
                high = mid;
            }else{
                low = mid +1;
            }
            
        }
        return low;
    }

    public boolean canFinish(int[] piles,int mid ,int h){
        int totalHours = 0;
        for(int pile:piles){
            totalHours+= (pile + mid -1)/mid;
        }
            return totalHours <= h;        
        
    }

    public int getMax(int[] piles){
        int max = 0;
        for(int pile:piles){
            if(max<pile){
                max = pile;
            }
        }
        return max;
    }
}
