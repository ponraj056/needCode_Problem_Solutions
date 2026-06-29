class Solution {
    boolean visited[];
    int c = 0;

    public void permutation(int[] nums) {
        Arrays.sort(nums);
        visited = new boolean[nums.length];
        backtrack(nums, new ArrayList<>());
    }

    public void backtrack(int nums[], List<Integer> list1) {
        if (list1.size() == nums.length) {
            boolean valid = true;
            for (int i = 1; i < list1.size(); i++) {
                int sum = 0;
                sum = list1.get(i - 1) + list1.get(i);
                int sq = (int) Math.sqrt(sum);
                if (sum != sq * sq) {
                    valid = false;
                    break;
                }
            }
            if (valid)
                c++;
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (visited[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && !visited[i - 1])
                continue;

            if (!list1.isEmpty()) {
                int sum = list1.get(list1.size() - 1) + nums[i];
                int sq = (int) Math.sqrt(sum);

                if (sq * sq != sum)
                    continue;
            }
            visited[i] = true;
            list1.add(nums[i]);
            backtrack(nums, list1);
            list1.remove(list1.size() - 1);
            visited[i] = false;
        }
    }

    public int numSquarefulPerms(int[] nums) {
        permutation(nums);
        return c;
    }
}