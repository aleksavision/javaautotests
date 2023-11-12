package Universe;

public class Uran implements java.io.Serializable {

    String ground;
    int age;

    private Saturn difSat;

    public Uran(String ground, int age, Saturn difSat) {
        this.ground = ground;
        this.age = age;
        this.difSat = difSat;
    }

    @Override
    public String toString() {
        return "Uran{" +
                "ground='" + ground + '\'' +
                ", age=" + age +
                ", difSat=" + difSat +
                '}';
    }
}


