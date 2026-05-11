class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>(nums.length * 2);
        for (int x : nums) {
            if (!set.add(x)) { 
                return true;
            }
        }
        return false;
    }
}