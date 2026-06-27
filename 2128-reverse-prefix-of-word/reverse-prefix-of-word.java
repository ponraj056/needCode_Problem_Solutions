class Solution {
    public String reversePrefix(String word, char ch) {
        char[] arr=new char[word.length()];
        int l=0;
        int r=word.indexOf(ch);
        int j=0;
        for(char i:word.toCharArray()){
            arr[j]=i;
            j++;
        }
        StringBuilder sb=new StringBuilder();
        while(l<r){
            char temp=arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;
            r--;
        }
        for(char i:arr) sb.append(i);
    return sb.toString();
    }
}