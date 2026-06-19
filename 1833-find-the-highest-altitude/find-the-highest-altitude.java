class Solution {
    public int largestAltitude(int[] gain) {
        int max=gain[0];
        int sum=gain[0];
        for(int i=1;i<gain.length;i++){
          sum=sum+gain[i];
          max=Math.max(max,sum);
        }
        if(max>0) return max;
        return 0;
    }
}