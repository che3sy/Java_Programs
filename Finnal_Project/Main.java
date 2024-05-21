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
		System.out.println("\u001B[33m");
		
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
        System.out.println("\u001B[0m");
        System.out.println("\u001B[36m");
        
        System.out.println("Welcome to Tic Tac Toe! \n");
        
        System.out.println("Pick game mode: \n");
        
        System.out.println("1. Player vs Player \n");
        System.out.println("2. Player vs Computer \n");
        System.out.println("3. Computer vs Computer \n");
        
        //prints up top
        
    

        /*
            good stuff below
        */
            
        

        String mode; 
        boolean valid = true;
        int modeInt;  
        Player player1 = new Player("temp", 1) ; //temp for compiler. 
        Player player2= new Player("temp", 2) ;

            while (valid){
                Input = new Scanner(System.in); 
                System.out.println("(enter number for game mode)");
                mode = Input.nextLine(); 
                modeInt = mode.compareTo("0");
            

                if(modeInt >= 1 && modeInt < 4 ){
                    
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
                        System.out.println("Do you want to go first(1) or Second(2)?");
                        System.out.print("Enter number:\t"); 
                        
                        boolean validInput = true;
                        
                        while(validInput){
                        String place = Input.nextLine(); 
                        int first = place.compareTo("0");
                        if(first >= 1 && first < 3){
                            
                            
                            if(first == 1){
                                Input = new Scanner(System.in); 
                                System.out.println("enter username for player");
                                player1 = new Human(Input.nextLine(), 1);
                                player2 = new Comp1("Computer", 2);
                                valid = false; 
                                validInput = false;
                            }
                            
                            else{
                                Input = new Scanner(System.in); 
                                System.out.println("enter username for player");
                                player2 = new Human(Input.nextLine(), 2);
                                player1 = new Comp1("Computer", 1);
                                valid = false;
                                validInput = false; 
                                
                            }
                        }
                        else{
                            System.out.println("Miss input, try again!"); 
                        }
                        
                        }
                        
                    }
                    else if (modeInt == 3){
                        System.out.println("Computer vs Computer mode selected");
                        
                        player1 = new Comp1("Computerz1",1);
                        player2 = new Comp2("Computerz2",2);
                
                        
                        valid = false; 
                    }
                }
                
                else{
                    System.out.println("Miss input, try again!");
                }
            }
    
        //make board
        char[][] board = new char[3][3];
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length;j++){
                board[i][j] = ' ';
            }
            
        }
        

        
        //loop while checkwin if blank
        while(player1.checkWin(board) == ' '){
            System.out.println("\033[H\033[2J");
            //board print
            
            System.out.println();
            System.out.println("\u001b[33mcurrent board:\u001b[0m");
            
            player1.printBoard(board);
            
            //player 1
            player1.getMove(player1.getPlayerDesig(), board);
            
            //in case win 
            if((player1.checkWin(board) == ' ')){
                //board for player 2
                
                System.out.println("\u001b[33m current board:\u001b[0m");
                
                
                player2.printBoard(board);
                player2.getMove(player2.getPlayerDesig(), board);
            }

            
            
        }
        
        System.out.println("\u001b[33mGame Over!\u001b[0m");
        player2.printBoard(board);
        System.out.println();

        if(player1.checkWin(board) == 'x'){
            System.out.println();
            System.out.println("\u001B[31m"+player1.getName() + " wins!"+"\u001B[0m");
        }
            else if(player1.checkWin(board) == 'o'){
                System.out.println();
                System.out.println("\033[0;34m"+player2.getName() + " wins!"+"\u001B[0m");
            }
                else{
                System.out.println(); 
                    System.out.println("\u001B[35m"+"It's a tie!"+"\u001B[0m");
                }
       
}

}




       
        

    