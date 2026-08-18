class Solution {
    public int climbStairs(int n) {
        int f=0,s=1;
        for(int i=1;i<=n;i++){
            int z=f+s;
            f=s;
            s=z;
        }
        return s;
    }
}