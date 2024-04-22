import java.util.Scanner; 
class HumanPlayer extends Player{
        Player second = new Player();
        
        public String toString(){
                return "The only human";
        }     
        
    
        public void askPlayer(){
            Scanner kbd = new Scanner(System.in);
            System.out.println("\n\n\tChoose your opponent! (first letter)\n");
            System.out.println("acolyte \t skillful \t random");
            String enemie = kbd.nextLine(); 

            if (enemie.equals("a")){
                second =  new acolyte();

                
            }
            
                else if (enemie.equals("s")){
                     second =  new skillful();

                }
        
                    else if (enemie.equals("r")){
                         second =  new random();
                    }
            
                        else{
                            System.out.println("Opps misinput, try again!");
                            askPlayer();
                        }
            

        } 

        public Player opposite(){
            return second;
        }
    
}