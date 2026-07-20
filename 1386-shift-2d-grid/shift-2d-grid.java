class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int r = grid[0].length;
        int c = grid.length;
        int arr[] = new int[r * c];
        int ind = 0;
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                arr[ind] = grid[i][j];
                ind++;
            }
        }
        k = k % (c * r);
        for (int p = 1; p <= k; p++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i >= 1; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }
        int ind1 = 0;
        for (int i = 0; i < c; i++) {
            List<Integer> list1 = new ArrayList<>();
            for (int j = 0; j < r; j++) {
                list1.add(arr[ind1]);
                ind1++;
            }
            list.add(list1);
        }
        return list;
    }
}