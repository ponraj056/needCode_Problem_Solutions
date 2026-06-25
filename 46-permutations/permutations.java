class Solution {
    boolean[] visited;
    List<List<Integer>> list1 = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<>());
        return list1;

    }

    public void backtrack(int nums[], List<Integer> list) {
        if (list.size() == nums.length) {
            list1.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            visited[i] = true;
            list.add(nums[i]);
            backtrack(nums, list);
            list.remove(list.size() - 1);
            visited[i] = false;
        }
    }
}