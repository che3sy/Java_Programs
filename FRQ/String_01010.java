/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */


/*(e) Assume that the string oldSeq has been properly declared and initialized and contains the string segment. Write a code segment that will remove the first occurrence of segment from oldSeq and store it in the string newSeq. Consider the following examples.

If oldSeq is "1100000111" and segment is "11", then "00000111" should be stored in newSeq.
If oldSeq is "0000011" and segment is "11", then "00000" should be stored in newSeq.
If oldSeq is "1100000111" and segment is "00", then "11000111" should be stored in newSeq.
Write the code segment below. Your code segment should meet all specifications and conform to the examples.*/

public class String_01010
{
	public static void main(String[] args) 
	{                 
	    String oldSeq="1100000111";
	    String segment = "00";
	    
	    int indSeg = oldSeq.indexOf(segment);
	    
	    String firstString = oldSeq.substring(0,indSeg);
        int firstLen = firstString.length();
        int endInd = indSeg+firstLen; 
        String lastString = oldSeq.substring(endInd); 
        
      
        String newSeq = firstString+lastString;
       
        System.out.println(newSeq);
	}
}
