package Animals;

public class Snake extends Zoo{

    String name1 = "Duna";
    int age1 = 2;
    String name2 = "Mira";
    int age2 = 4;

    public Snake (String name, int age){
        this.name1 = name;
        this.age1 = age;
    }

    @Override
    public void voiceZoo(String nameZoo) {
        super.voiceZoo(nameZoo);
        System.out.println("Sssssss");
    }


}