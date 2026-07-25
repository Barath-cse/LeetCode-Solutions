class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int n=0;
        for(int i:nums){
            while(i!=0){
                if(i%10==digit)n++;
                i/=10;
            }
        }
        return n;
    }
}