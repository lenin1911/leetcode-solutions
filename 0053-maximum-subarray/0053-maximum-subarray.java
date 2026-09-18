class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];
        int s=0;
        for(int n:nums){
            if(s<0) s=0;
            s+=n;
            max=Math.max(s,max);
        }
        return max;
    }
}