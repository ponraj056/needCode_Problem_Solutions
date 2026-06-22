class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for(char c[]:board){
            Arrays.fill(c,'.');
        }
        boolean[] rows=new boolean[n];
        boolean[] leftd=new boolean[2*n-1];
        boolean[] rightd=new boolean[2*n-1];
        solve(0,board,rows,leftd,rightd,ans,n);
        return ans;
    }
    public void solve(int col, char[][] board,boolean rows[],boolean leftd[],boolean rightd[], List<List<String>> ans,int n){
        if(col==n){
            List<String> temp=new ArrayList<>();
            for(char c[] : board){
                StringBuilder sb=new StringBuilder();
                for(char ch:c){
                    sb.append(ch);
                }
                temp.add(sb.toString());
            }
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int row=0;row<board.length;row++){
            int d1=row+col;
            int d2=n-1+row-col;
            if(rows[row]||leftd[d1]||rightd[d2]){
                continue;
            }
            rows[row]=true;
            board[row][col]='Q';
            leftd[d1]=true;
            rightd[d2]=true;
            solve(col+1,board,rows,leftd,rightd,ans,n);
             rows[row]=false;
            board[row][col]='.';
            leftd[d1]=false;
            rightd[d2]=false;
        }
    }

}