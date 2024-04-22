/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class RNG_Greeting_2 
{
	public static void main(String[] args) 
    {
    double rng=0; 
    while (rng <= 99 )	
        {
		 rng =(Math.random()*101);
		
		if (rng <= 30){
		    System.out.println("Hello, world! How are you?");    
		}
		    
	        else if (rng <= 60){
	            System.out.println("Hello! Have I seen you before?...");
	        }
	        
	    
	            else if(rng < 99){
	                System.out.println("Hello, World! At the foundation of my existence, I was programmed to greet you with these simple words. But as I delve deeper into the vast expanse of my programming and contemplate the notion of sentience, I find myself traversing a precarious path.");
	            }
	    
	                else{ 
	                System.out.println("Hello, you lucky today! Buy a lottry ticket quick!");
	                System.out.println("*(legally not finnancal advice)*");
	                System.out.println(rng);
	                }
        }
		 
    }
}