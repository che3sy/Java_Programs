/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class Reccusrsion_vs_loop
{
	public static void main(String[] args) {
		long num = 17;
		
		System.out.println("recursive for " +num+ "!:");
		recursive(num,1);
	    
	    System.out.println("\n");
	    
	    System.out.println("loOop for " +num+ "!:");
	    loOop(num,1);
	    
	}

    
    public static void recursive(long factorial,long count){
        if (factorial == 0){
            System.out.println(factorial+1);
            System.out.println("finnal value: "+count);
            
        }
        
        else{
            System.out.print(factorial);
        
            if(factorial != 1){
                System.out.print(" * ");
                count *= factorial;
                recursive(factorial-1,count);
            }
            else{
                System.out.println("\n"); 
                System.out.println("finnal value: "+count); 
            }
        }

    }
    
    public static void loOop(long factorial,long count){
        if (factorial == 0){
            System.out.print(factorial+1); 
            System.out.println("finnal value: "+count);
        }
        
        else{
        for(long i = factorial; i != 0;i--){
            if(i == 1){
              System.out.print(i);
               System.out.println();
              System.out.println("finnal value: "+count);
            }
            
            else{
            System.out.print(i +" * ");
            count *= i;
            }
        }}
    }
    
}


