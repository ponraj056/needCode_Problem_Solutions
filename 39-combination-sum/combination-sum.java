class Solution {
    List<List<Integer>> list=new ArrayList();
    public List<List<Integer>> combinationSum(int[] nums,int target) {
        com(0,nums,target,new ArrayList<>());
        return list;
    }
    public void com(int index,int nums[],int target,List<Integer> temp){
        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }
        if(target<0) return;
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            com(i,nums,target-nums[i],temp);
            temp.remove(temp.size()-1);
        }
    }
}