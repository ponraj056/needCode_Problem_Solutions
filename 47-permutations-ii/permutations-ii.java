class Solution {
    List<List<Integer>> list1=new ArrayList<>();
    boolean valid[];
    public List<List<Integer>> permuteUnique(int[] nums) {
        valid=new boolean[nums.length];
        backtrack(nums,new ArrayList<>());
        return list1;
    }
    public  void backtrack(int nums[],List<Integer> list){
        if(list.size()==nums.length){
            if(!list1.contains(list)){
              list1.add(new ArrayList<>(list));
            }
        }
        for(int i=0;i<nums.length;i++){
            if(valid[i]) continue;
            valid[i]=true;
            list.add(nums[i]);
            backtrack(nums,list);
            list.remove(list.size()-1);
            valid[i]=false;
        }
    }
}