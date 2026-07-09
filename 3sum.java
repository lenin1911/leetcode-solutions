class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>s=new HashSet<>();
        List<List<Integer>>l=new ArrayList<>();
        Arrays.sort(nums);
        int t=0;
        for(int i=0;i<nums.length;i++){
            int j=i+1;
            int k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==t){
                    s.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                }else if(sum<t) j++;
                else k--;
            }
        }
            l.addAll(s);
            return l;
    }
}
