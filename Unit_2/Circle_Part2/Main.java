/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class Main
{
	public static void main(String[] args) 
	{
		double radi1=5.6, radi2=6.7, radi3=2.3;
		System.out.println("The circumfrence of a radi with: "+radi1+ " is " +CircleCal.circumference(radi1)+ "\n area is: "+CircleCal.area(radi1)+"\n volume is: "+CircleCal.volume(radi1)+'\n');
		System.out.println("The circumfrence of a radi with: "+radi2+ " is " +CircleCal.circumference(radi2)+ "\n area is: "+CircleCal.area(radi2)+"\n volume is: "+CircleCal.volume(radi2)+'\n');
		System.out.println("The circumfrence of a radi with: "+radi3+ " is " +CircleCal.circumference(radi3)+ "\n area is: "+CircleCal.area(radi3)+"\n volume is: "+CircleCal.volume(radi3)+'\n');
	}
}
