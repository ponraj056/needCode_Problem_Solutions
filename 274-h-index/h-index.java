class Solution {
    public int hIndex(int[] c) {
        Arrays.sort(c);
        for(int i=0;i<c.length;i++){
           int paper=c.length-i;
           if(c[i]>=paper){
               return paper;
           }
        }
        return 0;
    }
}