public class NumberSorter
          {
          public static void main(String[] args)
                    {
                    int[] numbers={13, -5, 1240, 8, 7, -3, 2, 19, 0, 2000};
                    int i=0;
    
                   numbers=ArrayTools.sortArray(numbers);
                   for (int singleNum : numbers)
                             {
                             System.out.println("Numbers["+i+"] = "+singleNum);
                             i++;
                             }
                   }
        }