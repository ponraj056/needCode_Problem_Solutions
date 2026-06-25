class Solution {
    public String removeOuterParentheses(String s) {
         StringBuilder sc=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='('){
            if(!stack.isEmpty()){
                sc.append(c);
            }
            stack.push(c);
            }
            else{
                 stack.pop();


                 if(!stack.isEmpty()){
                    sc.append(c);
                 }


            }
        }
        return sc.toString();
    }
}