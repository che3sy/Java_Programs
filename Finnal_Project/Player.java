public class Player{
    private String name;
    private char playerDesig;
    
    public Player(String n, int move){
        name = n;
        if(move == 1){
            playerDesig = 'x';
            
        }
        
        else{
            playerDesig = 'o';
        }
            
    }
    
    public void getMove(char playerDesig, char[][] board){
    }
    
    public String getName(){
        return name; 
    }
    
    public char getPlayerDesig(){
        return playerDesig;
    }

    public void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(board[i][j] == ' '){
                    System.out.print("_ ");
                }
                    else if(board[i][j] == 'x'){
                        System.out.print("\u001B[31m"+board[i][j]+"\u001B[0m"+ " ");
                    }
                        else{
                            System.out.print("\u001B[34m"+board[i][j] + "\u001B[0m" + " ");
                        }
                
            }
            System.out.println();
        }
    }

    public void printBoard(char[][] board, int row, int col) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if(i == row && j == col){
                    System.out.print("\u001B[32m"+ board[i][j] + " " + "\u001B[0m");
                }
                else{
                    if(board[i][j] == ' '){
                        System.out.print("_ ");
                    }
                    else{
                        System.out.print(board[i][j] + " ");
                    }
                }
            }
            System.out.println();
        }
    }

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

    
}