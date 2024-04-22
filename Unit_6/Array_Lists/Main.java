import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<String> reindeers = new ArrayList<String>();
		String currInd;
        reindeers.add("Comet");
        reindeers.add("Cupid");
        reindeers.add("Dasher");
        reindeers.add("Dancer");
        reindeers.add("Prancer");
        reindeers.add("Vixen");
        reindeers.add("Rudolph");
        reindeers.add("Blitzen");
        
        StringSorter(reindeers);
        
        
        System.out.print(reindeers);
        
	}
	
	public static ArrayList<String> StringSorter(ArrayList<String> ArrayToCheck) {

        int[] IntifedArray = new int[ArrayToCheck.size()];
        boolean notSorted = true;
        
        
        for (int i = 0; i < IntifedArray.length; i++) {

            int index = (int) ArrayToCheck.get(i).charAt(0);

            if (65 <= index && index <= 90) {
                IntifedArray[i] = index + 32;
            } else if (97 <= index && index <= 122) {
                IntifedArray[i] = index;
            } else {
                //extra case for special char, puts it at end cuz yk special
                IntifedArray[i] = 1000;
            }
        }
        

        while (notSorted) {

            //keeps itterting from start to end
            for (int i = 0; i < IntifedArray.length - 1; i++) {

                //if true it will sort
                if (IntifedArray[i + 1] < IntifedArray[i]) {
                    int temp = IntifedArray[i]; //temp variable for switch
                    IntifedArray[i] = IntifedArray[i + 1];
                    IntifedArray[i + 1] = temp;
                
                    //sort to reflect on main array
                    String Switch = ArrayToCheck.get(i);
                    
                    
                    ArrayToCheck.set(i,ArrayToCheck.get(i + 1));
                    ArrayToCheck.set(i + 1,Switch);
                   

                    notSorted = false;
        
                }

                //(empty else)
            }

        }

        return ArrayToCheck;
    }
}

