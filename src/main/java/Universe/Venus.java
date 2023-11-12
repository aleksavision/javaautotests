package Universe;

public class Venus implements SolarSystem, Cloneable {

    String name = "Venus";
    int beforeVenus;
    int afterVenus;
    private Saturn saturn;

    @Override
    public void connect(){
        java.lang.System.out.println("All is connected");
        }
    @Override
    public void disconnect(){
        java.lang.System.out.println("All is disconnected");
        }

    @Override
    public void nameGalaxy() {
        java.lang.System.out.println("---Milky Way---");
    }


    public Venus(int beforeVenus, int afterVenus, String name, Saturn saturn) {
        this.beforeVenus = beforeVenus;
        this.afterVenus = afterVenus;
        this.name = name;
        this.saturn = saturn;
    }

    public void printInfo(){
        System.out.println(beforeVenus);
        System.out.println(afterVenus);
    }

    public<F> void genericMethod(F element){
        System.out.println(element);
    }

    ////// 17 lesson


    public Saturn getSaturn() {
        return saturn;
    }

    public void setSaturn(Saturn saturn) {
        this.saturn = saturn;
    }

    @Override
    public String toString() {
        return "Venus{" +
                "beforeVenus=" + beforeVenus +
                ", afterVenus=" + afterVenus +
                ", name='" + name + '\'' +
                '}';
    }

    // inner class

    public class Home{
        private int house;
        public void printAddress(){
            System.out.println(Venus.this);
            System.out.println(this);
            System.out.println(house);
        }
    }








}
