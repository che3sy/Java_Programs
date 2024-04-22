public class Circle
{
    double perim, area, volume;
    int rad;
    
    public Circle(int radius)
    {
        rad=radius;
        perim = 2*Math.PI*rad;
        area = Math.PI*rad*rad;
        volume = 4/3*Math.PI*rad*rad*rad;
    }
    
    void circleInfo()
    {
        System.out.println("Circle informations: \nperimeter = " +perim);
        System.out.println("area = "+area);
        System.out.println("volume = "+volume+"\n");
    }
}
