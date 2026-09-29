class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<9;i++){
            //HashSet<String> set=new HashSet<>();
            for(int j=0;j<9;j++){
                if(board[i][j]=='.') continue;
                String row=String.valueOf(board[i][j]+"Row"+i);
                String col=String.valueOf(board[i][j]+"Col"+j);
                String box=String.valueOf(board[i][j]+"Row"+"Box"+i/3+"_"+j/3);
                if(set.contains(row)||set.contains(col)||set.contains(box)) return false;
                set.add(row);
                set.add(col);
                set.add(box);

            }
        }   
        return true; 
    }
}