/* 

██╗██████╗░██████╗░░█████╗░██╗░░██╗██╗███╗░░░███╗
██║██╔══██╗██╔══██╗██╔══██╗██║░░██║██║████╗░████║
██║██████╦╝██████╔╝███████║███████║██║██╔████╔██║
██║██╔══██╗██╔══██╗██╔══██║██╔══██║██║██║╚██╔╝██║
██║██████╦╝██║░░██║██║░░██║██║░░██║██║██║░╚═╝░██║
╚═╝╚═════╝░╚═╝░░╚═╝╚═╝░░╚═╝╚═╝░░╚═╝╚═╝╚═╝░░░░░╚═╝
 */
class Cuppa
{
    private double price,side,length,width,height,radius,volume;
    private String typeOfCup;

        public Cuppa (double price,double side,String typeOfCup){
            this.price = price;
            this.side = side;
            this.typeOfCup = typeOfCup;
        }
        
        
        public Cuppa (double price, double diameter, double height,String typeOfCup){
            this.price = price;
            this.radius = diameter/2.0;
            this.height = height;
            this.typeOfCup = typeOfCup;
        }
        
        public Cuppa (double price, double length,double width, double height,String typeOfCup){
            this.price = price ;
            this.length = length;
            this.width = width;
            this.height = height;
            this.typeOfCup = typeOfCup;
        }
            
        public void calculateVol(){
            if (this.typeOfCup.equals("cube")){
                this.volume = MyTools.volCube(this.side);
            }
            
                else if (this.typeOfCup.equals("cylinder")){
                    this.volume = MyTools.volCylinder(this.height,this.radius);
                }
                
                    else{
                        this.volume = MyTools.volBox(this.length,this.width,this.height);
                    }
        }
        
        public double getVol(){
            return this.volume;
        }   

    
}