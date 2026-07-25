public class Solution {
    public int MaxProduct(int n) {
        ArrayList arr=new ArrayList();
        while(n!=0){
            arr.Add(n%10);
            n/=10;
        }
        arr.Sort();
        return (int)arr[arr.Count-1] * (int)arr[arr.Count-2];
    }
}