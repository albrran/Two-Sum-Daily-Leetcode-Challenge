class Solution {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> a = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num; 
        
        if(a.containsKey(diff)) {
            return new int[] {a.get(diff), i};
        }
        a.put(num, i);
        }
        return new int[] {};
    } 
}