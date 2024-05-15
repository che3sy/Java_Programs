import java.util.Scanner; 
class Human extends Player{
    private Scanner Input;
    
    public Human(String n, int move){
        super(n, move);
    }    

    public int getMove(char playerDesig, char[][] board){
        boolean confirm = true;
        boolean valid = true;
        String moveString;
        int moveInt = 0;
        int row=0,col=0;
        
    while (confirm){
        while (valid){
            Input = new Scanner(System.in); 
            System.out.println("Enter number for move location (1-9, top left corner is 1, middle left corner is 4, bottom right is 9)");
            moveString = Input.nextLine(); 
                
            if(moveString.compareTo("0") >= 1 && (moveString.compareTo("10") == -1 || (moveString.compareTo("10") >= 1 && moveString.compareTo("10") < 10 ))){
                moveInt = moveString.compareTo("0");
                row = (moveInt - 1) / 3; 
                col = (moveInt - 1) % 3;
                
                if(board[row][col] == '\u0000'){
                    valid = false;
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
        } 
        
    }
        return moveInt; 
    }

    
}