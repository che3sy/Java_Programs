/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class Palindrome_Finder {

    public static void main(String[] args){
        String[] Array = new String[10];
        for(int i =0;i<10;i++){
            int randomNumber = 65 + (int) Math.round(Math.random() * (58));
            String randomString = ((char)randomNumber) + "";
            Array[i] = randomString;
            
        }
        for(String stuff:Array)
            System.out.println(stuff);
        

        //String[] Array = {"Orange","Apple", "bannana"};
        String[] SortedArray = StringSorter(Array);
        System.out.println("\n");
        
        for(String stuff:SortedArray)
            System.out.println(stuff);
    }






    public static String[] StringSorter(String[] ArrayToCheck) {

        int[] IntifedArray = new int[ArrayToCheck.length];
        boolean notSorted = true;
        
        
        for (int i = 0; i < IntifedArray.length; i++) {

            int index = (int) ArrayToCheck[i].charAt(0);

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
                    String Switch = ArrayToCheck[i];
                    
                    ArrayToCheck[i] = ArrayToCheck[i + 1];
                    ArrayToCheck[i + 1] = Switch;

                    notSorted = false;
        
                }

                //(empty else)
            }

        }

        return ArrayToCheck;
    }
}