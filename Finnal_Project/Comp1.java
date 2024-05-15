class Comp1 extends Player{
    private char playerDesig = '\u0000';
    
    public Comp1(String n, int move){
        super(n, move);
    }
    
    public int getMove(char playerDesig, char[][] board)
    {
        this.playerDesig = playerDesig;
        return getBestMove(board);
    }


    public int getBestMove(char[][] board) {
        int bestScore = -1000;
        int move = 0;
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (board[i][j] == '\u0000') {
                    // Make the move
                    board[i][j] = playerDesig;
    
                    // Compute evaluation function for this move.
                    int moveScore = minimax(board, 0, false);
    
                    // Undo the move
                    board[i][j] = '\u0000';
    
                    // If the resulting moveScore is greater than the bestScore, update bestMove and bestScore
                    if (moveScore > bestScore) {
                        bestScore = moveScore;
                        move = i * 3 + j;
                    }
                }
            }
        }
        return move;
    }
    
    public int minimax(char[][] board, int depth, boolean isMaximizing) {
        char result = checkWin(board);
        if (result != '\u0000') {
            if (result == playerDesig) return 10;
            else if (result == 'd') return 0;
            else return -10;
        }
    
        if (isMaximizing) {
            int bestScore = -1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '\u0000') {
                        board[i][j] = playerDesig;
                        int score = minimax(board, depth + 1, false);
                        board[i][j] = '\u0000';
                        bestScore = Math.max(score, bestScore);
                    }
                }
            }
            return bestScore;
        } else {
            int bestScore = 1000;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (board[i][j] == '\u0000') {
                        board[i][j] = (playerDesig == 'x') ? 'o' : 'x';
                        int score = minimax(board, depth + 1, true);
                        board[i][j] = '\u0000';
                        bestScore = Math.min(score, bestScore);
                    }
                }
            }
            return bestScore;
        }
    }

    
}
