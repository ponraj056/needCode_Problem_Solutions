public class Solution {
    public int RemoveDuplicates(int[] nums) {
        int ind=1;
        for(int i=0;i<nums.Length-1;i++){
            if(nums[i]!=nums[i+1]){
                nums[ind]=nums[i+1];
              ind++;
            }
        }
        return ind;
    }
}