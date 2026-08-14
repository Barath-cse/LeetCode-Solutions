class Solution {
    public int maximumLengthSubstring(String s) 
    {
        HashMap<Character,Integer> map=new HashMap<>(); 
        int l=0,result=0;
        for(int r=0;r<s.length();r++){
            char c=s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            while(map.get(c)>2){
                char temp=s.charAt(l);
                map.put(temp,map.get(temp)-1);
                l++;
            }
            result=Math.max(result,r-l+1);

        }
        return result;
    }
}