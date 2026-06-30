class Solution {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder sb=new StringBuilder();
        s=s.toUpperCase();
        s=s.replace("-","");
        int c=0;
        for(int i=s.length()-1;i>=0;i--){
            if(c!=k) {
                sb.append(s.charAt(i));
            c++;
            }
            else{
             sb.append("-");
             sb.append(s.charAt(i));
             c=1;
            }
        }
        return sb.reverse().toString();
    }
}