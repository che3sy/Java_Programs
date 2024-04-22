class MyTools
{
    
    public static double volCube(double side){
        return side*side;
    }
        
    public static double volBox(double length, double width, double height){
        return length*width*height;
    }
        
    public static double volCylinder(double height, double radius){
        //πr2h
        return radius*Math.PI*2*height;
    }
    
    
}