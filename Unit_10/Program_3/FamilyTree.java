import java.util.ArrayList;
public class FamilyTree
    {
     public static void main(String[] args)
         {
          int numAncestors=0; float avgDeathAge=0;
          double[] values = new double[2];
         /*    
          Ancestor startPerson=new Ancestor("Kevin",101);
          startPerson.dad=new Ancestor("Stuart",71);
          startPerson.mom=new Ancestor("Sue",98);
          startPerson.dad.mom=new Ancestor("Mary",72);
          startPerson.dad.mom.dad=new Ancestor("William",58);
          startPerson.dad.mom.mom=new Ancestor("Isabella",67);
          startPerson.mom.dad=new Ancestor("Walter",56);
          startPerson.mom.mom=new Ancestor("Janet",88);
          startPerson.mom.dad.dad=new Ancestor("Walter",61);
          startPerson.mom.mom.dad=new Ancestor("Edgar",70);
          startPerson.mom.mom.mom=new Ancestor("Lois",69);
          startPerson.mom.mom.dad.mom=new Ancestor("Mana",85);
          */
          
          Ancestor startPerson=new Ancestor("Queen Elizabeth",96);
          startPerson.dad=new Ancestor("King George",56);
          startPerson.mom=new Ancestor("Elizabeth",101);
          startPerson.dad.dad=new Ancestor("King George",70);
          startPerson.dad.mom=new Ancestor("Mary",85);
          startPerson.dad.dad.dad=new Ancestor("King Edward",68);
          startPerson.dad.dad.mom=new Ancestor("Alexandra",80);
          startPerson.dad.dad.dad.mom=new Ancestor("Queen Victoria",81);
          startPerson.dad.dad.mom.dad=new Ancestor("King Christian",61);
            
            
            //========================================================
            values = calDeath(startPerson,avgDeathAge,values);
             avgDeathAge =  (float)values[0];
             numAncestors = (int)values[1];
             avgDeathAge = avgDeathAge/(float)numAncestors;
            //========================================================

            
            System.out.println("This family tree included "+numAncestors+" people.");
            System.out.println("The folks in this tree died on the average at "+avgDeathAge+" years old.");
         }
        
        
        //======================================================== 
        public static double[] calDeath(Ancestor child, float avgDeathAge, double[] values) {
            
            if (child != null) {
                values[0] += child.getAge();
                values[1]++;
                values = calDeath(child.dad, avgDeathAge, values);
                values = calDeath(child.mom, avgDeathAge, values);
            }
            return values;
        }
        //======================================================== 
         
         
}