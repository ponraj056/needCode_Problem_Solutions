public class Solution {
    public string SmallestSubsequence(string s) {
        Stack<char> stack1=new Stack<char>();
        Stack<char> stack2=new Stack<char>();
        StringBuilder sb=new StringBuilder();
        for(int i=s.Length-1;i>=0;i--){
           stack1.Push(s[i]);
        }
        while(stack1.Count > 0){
          char ch = stack1.Pop();
          if(stack2.Contains(ch)){
               continue;
          }
          while(stack2.Count>0 && stack2.Peek()>ch && stack1.Contains(stack2.Peek())) 
          stack2.Pop();

          stack2.Push(ch);
        }
       char[] c=stack2.ToArray();
       for(int i=c.Length-1;i>=0;i--){
        sb.Append(c[i]);
       }
        return sb.ToString();
    }
}