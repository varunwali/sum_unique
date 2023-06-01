class Solution {
    public int sumOfUnique(int[] nums) {
        int n = nums.length;
        int sum = 0;
        for(int num : nums){
            if(isUnique(nums, num)) sum += num;
        }
        return sum;
    }
    public boolean isUnique(int[] nums, int num){
        int count = 0;
        for(int n : nums)
            if(n == num) count++;
        return count == 1;
    }
}
