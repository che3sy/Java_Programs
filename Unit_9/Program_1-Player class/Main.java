import java.util.Scanner; 
public class Main
{
	public static void main(String[] args) {
	    Scanner kbd = new Scanner(System.in);  // Create a Scanner object
        System.out.println("enter username");
        String username = kbd.nextLine(); 
        
    
        HumanPlayer user = new HumanPlayer();
        user = startGame();
        
    
        
        System.out.println("\n\nAnnnd for team "+user+ " we haaaave: "+username+"\n");
        System.out.print("And for opposing team we have ");   
        user.opposite().playerGreet();
        System.out.print(" "+user.opposite());
	}
	 
	public static HumanPlayer startGame(){
	    HumanPlayer curr = new HumanPlayer();
	    Scanner kbd = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Would you like to be “x” or “o”?");

        String xoChoice = kbd.nextLine(); 
        
        if(xoChoice.equals("x")){
            curr = new xPlayer();

        }
        
            else if(xoChoice.equals("o")){
                curr = new oPlayer();

            }
        
                else{
                    System.out.println("Opps misinput, try again!");
                    startGame();
                }
	    return curr;
	   
	}
}
