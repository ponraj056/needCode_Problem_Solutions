class Solution {
    public int maxIceCream(int[] arr, int target) {
        int sum=0;
        int c=0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(sum>target) return c;
            sum+=arr[i];  
            if(sum<=target){
                c++;
            }
        }
           return c;
    }
}