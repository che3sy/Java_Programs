/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class MySort
{
	boolean notSorted = true; 
    int[] ArrayToCheck; 

    public MySort(int[] ArrayToCheck){
        this.ArrayToCheck = ArrayToCheck;
    }
    /*array flag
    public void print(int[] printed){
        for(int num:printed){
            System.out.println(num);
        }
    }
    */ 
    
    public void sort(){
        
        
        while (notSorted) {
            boolean sorted = true;
    
                for (int i = 0; i < ArrayToCheck.length - 1; i++) {
                    
                    if (ArrayToCheck[i + 1] < ArrayToCheck[i]) {
                        int temp = ArrayToCheck[i];
                        ArrayToCheck[i] = ArrayToCheck[i + 1];
                        ArrayToCheck[i + 1] = temp;
                        sorted = false;
                    }
                }
        
                if (sorted) {
                    notSorted = false;
                }
        }
    
        
        for (int num : ArrayToCheck)
            System.out.println(num);
    }

}