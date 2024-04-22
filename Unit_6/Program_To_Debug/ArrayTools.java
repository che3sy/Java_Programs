public class ArrayTools
         {

         public static int[] sortArray(int[] tempNumbers)
                   {
                   int smallest, temp;
                   for (int i=0;i<tempNumbers.length;i++)
                             {
                                 
                             //change loc smallest=i;
                             for (int j=i+1;j<tempNumbers.length;j++)
                              
                                       {
                                            smallest=i;//its here now
 
                                       if (tempNumbers[j]<tempNumbers[smallest])
                                                 smallest=j;
                                       if (smallest != i)
                                                 {
                                                     
                                                 temp=tempNumbers[i];
                                                 tempNumbers[i]=tempNumbers[smallest];
                                                 tempNumbers[smallest]=temp;
                                                  
                                                 
                                                 }
                                       }
                                        
                             }
                return tempNumbers;
                }
         
       }