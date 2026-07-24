class Solution {
    public int[] concatWithReverse(int[] nums) 
    {
        int[] arr=new int[nums.length*2];
        int low=0,high=arr.length-1;
        while(low<high){
            arr[low]=nums[low];
            arr[high]=nums[low];
            low++;
            high--;
        }
        return arr;
    }
}