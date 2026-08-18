class Solution {
    public int digitFrequencyScore(int n) 
    {
        int[] fre=new int[10];
        while(n!=0){
            int temp=n%10;
            fre[temp]++;
            n/=10;
        }
        int num=0;
        for(int i=0;i<fre.length;i++){
            num+=i*fre[i];
        }
        return num;
    }
}