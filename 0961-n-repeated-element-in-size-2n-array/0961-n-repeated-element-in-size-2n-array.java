class Solution {
    public int repeatedNTimes(int[] nums) 
    {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> c:map.entrySet()){
            if(nums.length/2 == c.getValue())return c.getKey();
        }
        return -1;
    }
}