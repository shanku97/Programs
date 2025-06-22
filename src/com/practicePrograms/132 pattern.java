public class Solution {
public boolean find132pattern(int[] nums) {
for (int i = 0; i < nums.length - 2; i++) {
for (int j = i + 1; j < nums.length - 1; j++) {
for (int k = j + 1; k < nums.length; k++) {
if (nums[k] > nums[i] && nums[j] > nums[k]) return true;
}
}
}
return false;
}
public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {1,7,4,3}; 
        System.out.println(sol.find132pattern(nums));
    }
}
