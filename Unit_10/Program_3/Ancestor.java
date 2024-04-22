public class Ancestor
    {
     private String name;
     private int deathAge;
     Ancestor dad, mom;

     Ancestor(String nombre, int anoDeMuerte)
         {
          name=nombre;
          deathAge=anoDeMuerte;
          dad=null; mom=null;
         }

     int getAge()
         {
          return deathAge;
         }

     String getName()
         {
          return name;
         }
    }