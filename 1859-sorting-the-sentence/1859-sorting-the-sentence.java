class Solution {
    public String sortSentence(String s) {
        StringBuilder sb=new StringBuilder();
        String[] arr=s.split(" ");
        String[] arr1=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String temp=arr[i];
            int n=Character.getNumericValue(temp.charAt(temp.length()-1));
            arr1[n-1]=temp.substring(0,temp.length()-1);
        }
        for(int i=0;i<arr1.length;i++){
            sb.append(arr1[i]);
            if(i<arr1.length-1)sb.append(" ");
        }
        return sb.toString();
    }
}