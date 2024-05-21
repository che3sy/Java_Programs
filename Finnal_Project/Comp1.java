  class Comp1 extends Player{
     /* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */


/*

████████╗██╗░█████╗░████████╗░█████╗░░█████╗░████████╗░█████╗░███████╗
╚══██╔══╝██║██╔══██╗╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝██╔══██╗██╔════╝
░░░██║░░░██║██║░░╚═╝░░░██║░░░███████║██║░░╚═╝░░░██║░░░██║░░██║█████╗░░
░░░██║░░░██║██║░░██╗░░░██║░░░██╔══██║██║░░██╗░░░██║░░░██║░░██║██╔══╝░░
░░░██║░░░██║╚█████╔╝░░░██║░░░██║░░██║╚█████╔╝░░░██║░░░╚█████╔╝███████╗
░░░╚═╝░░░╚═╝░╚════╝░░░░╚═╝░░░╚═╝░░╚═╝░╚════╝░░░░╚═╝░░░░╚════╝░╚══════╝

*/

    private char playerDesig = ' '; //uses prvie char cuz constructers might differ in methods
    public Comp1(String n, int num){
        super(n, num);
    }
    
    public void getMove(char playerDesig,char[][] board) {
        //priv var 
        this.playerDesig = playerDesig;
        
        int bestScore = -1000; 
        int row = 0;
        int col = 0;
        
        //for all moves
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // Check if cell is empty
                if (board[i][j] == ' ') {
                    // Make the move
                    board[i][j] = playerDesig;
    
                    // Compute evaluation function for this move.
                    int moveScore = minimax(board, 0, false);
            
                    // Undo the move because reflected on board
                    board[i][j] = ' ';
    
                    //track highest score
                    // If the resulting moveScore is greater than the bestScore, update bestMove and bestScore
                    if (moveScore > bestScore) {
                        
                        bestScore = moveScore;
                        row = i; 
                        col = j; 
                    }
                }
            }
        }
        
        board[row][col] = playerDesig;
        
        System.out.println();
        System.out.println("Computer move: " + ((row * 3 + col)+1));
        System.out.println();
        
        
    }
    
    
    //reward system
    public int minimax(char[][] board, int depth, boolean isMaximizing) {
        
        char result = checkWin(board); //stored for easier access
        
        if (result != ' ') { //check for win
            if (result == playerDesig) {
                return 10 - depth; //take depth (how long it took) into accout 
            } 
            
            else if (result == 'd') {
                return 0; //win reward
            } 
            
            else {
                return depth - 10; //lose loss
            }
        }
    
        //best case    
        if (isMaximizing) { //isMaximizing is a switch for taking turn
            int bestScore = -1000; 
            for (int i = 0; i < 3; i++) { //loop for node
                for (int j = 0; j < 3; j++) { 
                    if (board[i][j] == ' ') { 
                        board[i][j] = playerDesig;
                        int score = minimax(board, depth + 1, false); //depth to track node 
                        board[i][j] = ' ';
                        
                        if (score > bestScore) { //best case 
                            bestScore = score;
                        }
                    }
                }
            }
            return bestScore;
        } 
        
        //minimizer worst case
        else {
            int bestScore = 1000;
            
            for (int i = 0; i < 3; i++) { //loops for nodes 
                for (int j = 0; j < 3; j++) {
                    
                    if (board[i][j] == ' ') {
                        
                        //basicaly a switch (for if and opposite of the current player desg), this functionality can be achived via ? operator if u want to see
                        if (playerDesig == 'x') {
                          board[i][j] = 'o';
                        } 
                        
                        else {
                          board[i][j] = 'x';
                        }
                        
                        int score = minimax(board, depth + 1, true);
                        board[i][j] = ' ';
                        
                        if (score < bestScore) {
                            bestScore = score;
                        } 
                    }
                }
            }
            
            return bestScore;
        }
    }
    
    
    
    //check win is here for other ppl programs
    /*
    public char checkWin(char[][] board) {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (board[row][0] == board[row][1] && board[row][0] == board[row][2] && board[row][0] != ' ') {
                
                return board[row][0];
            }
        }
    
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (board[0][col] == board[1][col] && board[0][col] == board[2][col] && board[0][col] != ' ') {
                
                return board[0][col];
            }
        }
    
        // Check diagonals
        if ((board[0][0] == board[1][1] && board[0][0] == board[2][2] && board[0][0] != ' ') ||
            (board[0][2] == board[1][1] && board[0][2] == board[2][0] && board[0][2] != ' ')) {
                
            return board[1][1]; 
        }
    
        // Check for a draw (all cells filled)
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] == ' ') { 
                    return ' '; // No draw, there are empty cells
                }
            }
        }
    
        // If no winning line is found and there are no empty cells, it's a draw
        return 'd'; 
    }
    */
}