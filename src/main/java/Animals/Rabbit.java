package Animals;

public class Rabbit extends Zoo {

    String name1 = "Bunny";
    int age1 = 2;
    String name2 = "Danny";
    int age2 = 3;

    public Rabbit(String name, int age) {
        this.name1 = name;
        this.age1 = age;
    }

    @Override
    public void voiceZoo(String nameZoo) {
        super.voiceZoo(nameZoo);
        System.out.println("Frrrrrr");
    }







}


