class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        ArrayList<Integer> arr=new ArrayList<>();
        int fre[] =new int[26];
        for(char c:p.toCharArray()){
            fre[c-'a']++;
        }
        int n=p.length();
        for(int i=0;i<=s.length()-n;i++){
            int[] fre2=new int[26];
            for(char c:s.substring(i,i+n).toCharArray()){
                fre2[c-'a']++;
            }
            if(Arrays.equals(fre,fre2))arr.add(i);
        }
        return arr;
    }
}