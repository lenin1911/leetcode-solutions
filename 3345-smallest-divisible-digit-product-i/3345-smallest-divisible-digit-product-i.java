class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            int a=n;
            int p=1;
            while(a>0){
                p*=a%10;
                a/=10;
            }
            if(p%t==0){
                return n;
            }
            n++;
        }
       // return -1;
    }
}