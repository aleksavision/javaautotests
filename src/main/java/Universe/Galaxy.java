package Universe;

public interface Galaxy {

   public void nameGalaxy();
   default void otherData(){
       System.out.println("default");
   };


}
