// LeetCode 41 - First Missing Positive
// Approach:
// Use a boolean array to mark present positive numbers.
// Traverse from 1 to n and return the first missing value.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        boolean[] s = new boolean[n + 1];

        for (int i : nums) {
            if (i > 0 && i <= n)
                s[i] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!s[i])
                return i;
        }

        return n + 1;
    }
}
