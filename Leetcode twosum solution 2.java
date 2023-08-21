class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] pepe = {0,4};
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {

                if(nums[i] + nums[j] == target) {
                    int[] array = {i,j};
                    return array;
                }
            }
        }
        return pepe;
    } 
}