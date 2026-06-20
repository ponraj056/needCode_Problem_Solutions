class Solution {
    public List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        subsets(0, nums, new ArrayList<>());
        return list;
    }

    public void subsets(int index, int nums[], List<Integer> temp) {
        if (index == nums.length) {
            list.add(new ArrayList<>(temp));
            return;
        }
        temp.add(nums[index]);
        subsets(index + 1, nums, temp);
        temp.remove(temp.size() - 1);
        subsets(index + 1, nums, temp);
    }
}