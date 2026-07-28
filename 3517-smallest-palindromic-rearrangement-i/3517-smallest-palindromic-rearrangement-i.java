class Solution {
    public String smallestPalindrome(String s) 
    {
        if(s.length()<4)return s;
        ArrayList<Character> arr=new ArrayList<>();
        for(int i=0;i<s.length()/2;i++){
            arr.add(s.charAt(i));
        }
        Collections.sort(arr);
        StringBuilder sb=new StringBuilder();
        for(char c:arr){
            sb.append(c);
        }
        if(s.length()%2!=0)sb.append(s.charAt(s.length()/2));
        Collections.reverse(arr);
        for(char c:arr){
            sb.append(c);
        }
        return sb.toString();
    }
}