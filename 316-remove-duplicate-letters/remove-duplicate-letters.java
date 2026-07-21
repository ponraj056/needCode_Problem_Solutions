class Solution {
    public String removeDuplicateLetters(String s) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(int i=s.length()-1;i>=0;i--){
            stack1.push(s.charAt(i));
        }
        while(!stack1.isEmpty()){
           char ch=stack1.pop();
           if(stack2.contains(ch)){
             continue;
           }
           while(!stack2.isEmpty() && stack2.peek()>ch && stack1.contains(stack2.peek())) stack2.pop();
           stack2.push(ch);
        }
        System.out.println(stack1);
        StringBuilder sb=new StringBuilder();
        while(!stack2.isEmpty()){
            sb.append(stack2.peek());
            stack2.pop();
        }
        return sb.reverse().toString();
        }
}