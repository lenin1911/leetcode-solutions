class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer>a=new HashSet<>();
        for(int n:nums){
            if(a.contains(n)){
                return true;
            }
                a.add(n);
        }
        return false;
    }
}