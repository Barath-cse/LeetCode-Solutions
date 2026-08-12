class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> t=new ArrayList<>();
        for(Map.Entry<Integer,Integer> s:map.entrySet()){
            if(s.getValue()==2)t.add(s.getKey());
        }
        int[] arr=new int[t.size()];
        for(int i=0;i<t.size();i++){
            arr[i]=t.get(i);
        }
        return arr;
    }
}