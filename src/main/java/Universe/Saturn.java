package Universe;


public class Saturn implements SolarSystem, Cloneable, java.io.Serializable {

    @Override
    public void connect() {
        java.lang.System.out.println("All is connected");
    }

    @Override
    public void disconnect() {
        java.lang.System.out.println("All is disconnected");
    }

    @Override
    public void nameGalaxy() {
        java.lang.System.out.println("---Milky Way---");
    }

    public static final String constantaText = "CONSTANTA TEXT";
    public static final int constantaNumber = 4;

    ///
    String name = "Saturn";
    int oldData;
    int newData;
    String ground;

    public Saturn(int oldData, int newData, String ground) {
        this.newData = newData;
        this.oldData = oldData;
        this.ground = ground;
    }

    @Override
    public String toString() {
        return "Saturn{" +
                "name='" + name + '\'' +
                ", oldData=" + oldData +
                ", newData=" + newData +
                ", ground='" + ground + '\'' +
                '}';
    }
////Long version
//    public int compareTo(Saturn<N, T> saturn) {
//        if (this.newData == saturn.newData){
//            return 0;
//        } else if (this.newData < saturn.newData){
//            return -1;
//        } else {
//            return 1;
//        }
//    }
//
//    //short version
//    @Override
//    public int compareTo(Saturn<N, T> saturn){
//        int i = ground.compareTo(saturn.ground);
//        if (i !=0) return i;
//
//        return Integer.compare(this.newData, saturn.newData);
//    }


}




