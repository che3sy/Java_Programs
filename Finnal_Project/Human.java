import java.util.Scanner; 
class Human extends Player{
    private Scanner Input;
    
    public Human(String n, int move){
        super(n, move);
    }    

    public void getMove(char playerDesig, char[][] board){
        boolean confirm = true;
        boolean valid = true;
        String moveString;
        int moveInt = 1;
        int row=0,col=0;
        
    while (confirm){
        while (valid){
            Input = new Scanner(System.in); 
            System.out.println('\n');
            System.out.println("   <-------->");
            System.out.println("Player: " + getName() + " turn");
            System.out.println();
            System.out.println("Enter number for move location (1-9, top left corner is 1, middle left corner is 4, bottom right is 9)");
            moveString = Input.nextLine(); 
            moveInt = moveString.compareTo("0");
                
            if(moveInt >= 1 && moveInt < 10 ){
                moveInt = moveString.compareTo("0");
                row = (moveInt - 1) / 3; 
                col = (moveInt - 1) % 3;
                
                if(board[row][col] == ' '){
                    valid = false;
                }
                
                else{
                    System.out.println("Miss input, try again!");
                }
            }
            
            else{
                System.out.println("Miss input, try again!");
            }
        }
        
        System.out.println("board if you confirm move"); 
        
        board[row][col] = playerDesig; 
        
        printBoard(board,row,col); 
        
        Input = new Scanner(System.in); 
        System.out.println("press any button (that is not \"e\") to confirm move, press \"e\" to place somewhere else");
            
            
        if(!Input.nextLine().equals("e")){
            confirm = false; 
            valid = false;
        } 
        
        else{
            valid = true;
            moveString = "";
            
            board[row][col] = ' ';
        }
        
    }
        
    }

    
}