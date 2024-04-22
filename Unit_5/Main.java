/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
public class Main
{
	public static void main(String[] args) {
		double cubeCupSide=9.0, cubePrice=19.95;
        double boxCupLength=5.5, boxCupHeight=12, boxCupWidth=7.5, boxPrice=17.95;
        double cylCupHeight=15.0, cylCupDiameter=8.0, cylPrice=12.37;
        
        //double price,double side,String typeOfCup
        //double price, double diameter, double height,String typeOfCup
        //double price, double length,double width, double height,String typeOfCup
              
        Cuppa cubeCup=new Cuppa(cubePrice, cubeCupSide,"cube");
        Cuppa cylinderCup=new Cuppa(cylPrice, cylCupDiameter, cylCupHeight,"cylinder");
        Cuppa boxCup=new Cuppa(boxPrice, boxCupLength, boxCupWidth, boxCupHeight,"box");
        
      
        cubeCup.calculateVol();
        boxCup.calculateVol();
        cylinderCup.calculateVol();
        
        for(int i = 0; i <10; i++){
            System.out.print("Cuppa! ");
        }
        System.out.println();
        System.out.println("The cube cuppa has a volume of " + cubeCup.getVol() + " mL");
        System.out.println("The cylinder cuppa has a volume of " + cylinderCup.getVol() + " mL");
        System.out.println("The box cuppa has a volume of " + boxCup.getVol() + " mL");
		
	}
}
