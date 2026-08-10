public class Solution {
    public IList<int> FindDuplicates(int[] nums) {
        List<int> arr=new List<int>();
        Array.Sort(nums);
        for(int i=0;i<nums.Length-1;i++){
            if(nums[i]==nums[i+1]){
                arr.Add(nums[i]);
                i++;
            }
        }
        return arr;
    }
}