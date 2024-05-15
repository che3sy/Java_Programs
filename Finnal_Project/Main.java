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

import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
		Scanner Input;
        System.out.println(" _________  ___  ________            ");
        System.out.println("|\\___   ___\\  \\|\\   ____\\          ");
        System.out.println(" \\|___ \\  \\_\\ \\  \\ \\  \\___|          ");
        System.out.println("      \\ \\  \\ \\ \\  \\ \\  \\             ");
        System.out.println("       \\ \\  \\ \\ \\  \\ \\  \\____        ");
        System.out.println("        \\ \\__\\ \\ \\__\\ \\_______\\      ");
        System.out.println("         \\|__|  \\|__|\\|_______|      ");
        System.out.println("                                     ");
        System.out.println("                                     "); 
        System.out.println("                                     ");
        System.out.println("  _________  ________  ________      ");
        System.out.println(" |\\___   ___\\\\   __  \\|\\   ____\\     ");
        System.out.println(" \\|___ \\  \\_\\ \\  \\|\\  \\ \\  \\___|     "); 
        System.out.println("      \\ \\  \\ \\ \\   __  \\ \\  \\        ");
        System.out.println("       \\ \\  \\ \\ \\  \\ \\  \\ \\  \\____   ");
        System.out.println("        \\ \\__\\ \\ \\__\\ \\__\\ \\_______\\ ");
        System.out.println("         \\|__|  \\|__|\\|__|\\|_______| ");
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println("                                     ");
        System.out.println("  _________  ________  _______       ");
        System.out.println(" |\\___   ___\\\\   __  \\|\\  ___ \\      ");
        System.out.println(" \\|___ \\  \\_\\ \\  \\|\\  \\ \\   __/|     ");
        System.out.println("      \\ \\  \\ \\ \\  \\\\  \\ \\  \\_|/__   ");
        System.out.println("       \\ \\  \\ \\ \\  \\\\  \\ \\  \\_|\\ \\  ");
        System.out.println("        \\ \\__\\ \\ \\_______\\ \\_______\\ ");
        System.out.println("         \\|__|  \\|_______|\\|_______| ");
        
        System.out.println("Welcome to Tic Tac Toe! \n");
        
        System.out.println("Pick game mode: \n");
        
        System.out.println("1. Player vs Player \n");
        System.out.println("2. Player vs Computer \n");
        System.out.println("3. Computer vs Computer \n");
        
        

        String mode; 
        boolean valid = true;
        int modeInt;  
        Player player1 = new Player("temp", 1) ;
        Player player2= new Player("temp", 2) ;

            while (valid){
                Input = new Scanner(System.in); 
                System.out.println("(enter number for game mode)");
                mode = Input.nextLine(); 
                
            

                if(mode.compareTo("0") >= 1 && mode.compareTo("4") < 4 ){
                    modeInt = mode.compareTo("0");
                    if (modeInt == 1){
                        System.out.println("Player vs Player mode selected");
                        
                        Input = new Scanner(System.in); 
                        System.out.println("enter username for player 1");
                        player1 = new Human(Input.nextLine(), 1);
                        
                        Input = new Scanner(System.in); 
                        System.out.println("enter username for player 2");
                        player2 = new Human(Input.nextLine(), 2);
                        
                        valid = false; 
                    }

                    else if (modeInt == 2){
                        System.out.println("Player vs Computer mode selected");
                        Input = new Scanner(System.in); 
                        
                        System.out.println("enter username for player");
                        player1 = new Human(Input.nextLine(), 1);
                        player2 = new Comp1("Computer", 2);

                        valid = false; 
                    }
                    else if (modeInt == 3){
                        System.out.println("Computer vs Computer mode selected");

                        valid = false; 
                    }
                }
                
                else{
                    System.out.println("Miss input, try again!");
                }
            }
    
        char[][] board = new char[3][3];
        char[][] boardCopy = new char[3][3];
        int move = 0;
        int row = 0, col = 0;
        
        while(player1.checkWin(board) == '\u0000'){
                for (int i = 0; i < board.length; i++) {
                    for (int j = 0; j < board[i].length; j++) {
                        boardCopy[i][j] = board[i][j];
                    }
                }
            player1.printBoard(board);
           
            move = player1.getMove(player1.getPlayerDesig(), boardCopy);
            row = (move - 1) / 3;
            col = (move - 1) % 3;
            
            if(row >= 0 && col >= 0){
                board[row][col] = player1.getPlayerDesig();
            }
            
            for (int i = 0; i < board.length; i++) {
                for (int j = 0; j < board[i].length; j++) {
                    boardCopy[i][j] = board[i][j];
                }
            }

            if((player1.checkWin(board) == '\u0000')){
                player2.printBoard(board);
                move = player2.getMove(player2.getPlayerDesig(), boardCopy);
                System.out.println("Computer move: " + move);
                row = (move) / 3;
                col = (move) % 3;
                System.out.println("row: " + row + " col: " + col);
                if(row >= 0 && col >= 0){
                    board[row][col] = player2.getPlayerDesig();
                }
            }

            
            
        }
        System.out.println("Game Over!");

        if(player1.checkWin(board) == 'x'){
            System.out.println(player1.getName() + " wins!");
        }
            else if(player1.checkWin(board) == 'o'){
                System.out.println(player2.getName() + " wins!");
            }
                else{
                    System.out.println("It's a tie!");
                }
       
}

}




       
        

    