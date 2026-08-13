class Solution {
    public int maxDistinct(String s) 
    {
        char[] arr=s.toCharArray();
        HashSet<Character> set=new HashSet<>();
        for(char c:arr){
            set.add(c);
        }
        return set.size();
    }
}