class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows=new HashSet[n];
        HashSet<Character>[] cols=new HashSet[n];
        HashSet<Character>[] boxes=new HashSet[n];
        for(int i=0;i<n;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char ch=board[i][j];
                if(ch=='.'){
                    continue;
                }
                if(rows[i].contains(ch)){
                    return false;
                }
                rows[i].add(ch);
                if(cols[j].contains(ch)){
                    return false;
                }
                cols[j].add(ch);
                int index=(i/3)*3+(j/3);
                if(boxes[index].contains(ch)){
                    return false;
                }
                boxes[index].add(ch);
            }
        }
        return true;
    }
}
