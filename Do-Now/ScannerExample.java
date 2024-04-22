/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
import java.util.Scanner;

public class ScannerExample
{
	public static void main(String[] args) 
	{
		Scanner FromKbd = new Scanner(System.in);
		
		System.out.println("Whats your name?");
		String Name= FromKbd.nextLine();
		
		System.out.println("How many scoops do you like");
		double scoops= FromKbd.nextDouble();
		
		System.out.println("Whats your fav icecream Flavor?");
		String favFlavor= FromKbd.nextLine();
		
		//System.out.println("hi");
		//char hi = FromKbd.nextChar();
		
		System.out.println("Your name is "+Name+ " your fav ice cream flavor is "+favFlavor+ " your ideal amount of scoops is "+scoops);;
	    //System.out.println("hi");
	    
	}
}
