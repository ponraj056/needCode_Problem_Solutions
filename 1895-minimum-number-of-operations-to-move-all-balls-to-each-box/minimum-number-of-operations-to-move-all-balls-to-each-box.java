class Solution {
    public int[] minOperations(String boxes) {
        int prefix[]=new int[boxes.length()];
        Arrays.fill(prefix,0);
        for(int i=0;i<boxes.length();i++){
           if(boxes.charAt(i)=='1'){
            for(int j=0;j<boxes.length();j++){
                prefix[j]+=Math.abs(j-i);
            }
           }
        }
        return prefix;
    }
}