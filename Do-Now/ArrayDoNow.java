/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */

public class ArrayDoNow
{
	public static void main(String[] args) {
	    int[][] numArray = {{-3,-7,-2,-5},
	                        {-1,-13,-13}, 
	                        {-6,-7,-12,-2,-4}
	                       };
	    int biggest=Integer.MIN_VALUE;
	    int smallest=Integer.MAX_VALUE; 
	    double average=0; 
	    int currentNum;    
		int count=0;
		
		for(int i =0; i<numArray.length; i++){
	        
	        for(int j=0; j<numArray[i].length;j++){
	            currentNum = numArray[i][j];
	            average += currentNum;
	            
	            if (currentNum>biggest){
	                biggest = currentNum;
	            }
	            
	            if (currentNum<smallest){
	                smallest = currentNum;
	            }
	            
	            count++;
	        }
		}
		average /= count;
		System.out.println("Average:"+average+"\tBiggest: "+biggest+"\tSmallest: "+smallest);
		   
		    
		    
		    
		    
		    
		    
		    
		    
	}
}
