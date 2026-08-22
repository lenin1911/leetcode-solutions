class Solution {
    public boolean checkDivisibility(int n) {
        int i=0,j=1;
        int m=n;
        while(n>0){
            int d=n%10;
            i+=d;
            j*=d;
            n/=10;
        }
        return m%(i+j)==0;
    }
}