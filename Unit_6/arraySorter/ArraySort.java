/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
import java.util.Random;
public class ArraySort
{
	public static void main(String[] args) {
	    
	
    Random rand = new Random();

	int[] ArrayToCheck = new int[100];
	
	for(int i=0; i<ArrayToCheck.length;i++){
	    ArrayToCheck[i]= rand.nextInt();
	}
	   
	
	//int[] ArrayToCheck = {1,0,-5,-20,1000,55};
    
    MySort sortedArray = new MySort(ArrayToCheck);
    
    
    sortedArray.sort();
	
    }

    
}