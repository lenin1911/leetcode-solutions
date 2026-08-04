class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        Set<Integer>s=new HashSet<>();
        for(int i:nums) s.add(i);
        List<Integer>l=new ArrayList<>();
        for(int i=a;i<=b;i++){
            if(!s.contains(i)) l.add(i);
        }
        return l;
    }
}