/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class Corner_Finder_Extra
{
	public static void main(String[] args) {
	int len=5, x = 6, y = 8 ;
	int possx = 10-x,possy;
	
	if (y > len)
	    possy = len;
	else 
	    possy = y;
	
	
	
	if (possx < y && possx < len)
	    len = possx;
	    
	    else if (possy < x && possy < len)
	        len = possy;
	        
    
    Draw.drawLine(x,y, (x+len),y);
    Draw.drawLine((x+len),y, (x+len),(y-len));
    Draw.drawLine((x+len),(y-len), x,(y-len));
    Draw.drawLine(x,(y-len), x,y);
    
    System.out.println("side length = " +len+", area = " +len*len+ ".");
    
	}
}
