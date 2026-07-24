class Solution {
    public int mirrorDistance(int n) 
    {
        int temp1=n;
        int temp2=0;
        while(temp1!=0){
            temp2=(temp2*10)+(temp1%10);
            temp1/=10;
        }
        return Math.abs(n-temp2);
    }
}