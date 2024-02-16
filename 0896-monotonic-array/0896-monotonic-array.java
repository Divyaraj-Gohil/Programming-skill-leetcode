class Solution {
        public boolean isIncreasing(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(i+1 < nums.length && nums[i] > nums[i+1])
                return false;
        }
        return true;
    }
    public boolean isDecresing(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            if(i+1 < nums.length && nums[i] < nums[i+1])
                return false;
        }
        return true;
    }
    public boolean isMonotonic(int[] nums) {
        if(isIncreasing(nums))
            return true;
        else if(isDecresing(nums))
            return true;
        return false;
    }

}