package Animals;

public class Cat<F> extends Zoo implements Ex{
    private String name1 = "Sonia";
    private int age1 = 2;
    String name2 = "Bonia";
    public int age2 = 7;
    public String name3 = "Monia";
    int age3 = 11;

    public static final int constatantqty = 5;

    @Override
    public void plus(int qty) {
        System.out.println("+++++");
    }

    @Override
    public void minus(int qty) {
        System.out.println("------");
    }

    public Cat(String name, int age){
        this.name1 = name;
        this.age1 = age;
    }

    @Override
    public void voiceZoo(String nameZoo) {
        super.voiceZoo(nameZoo);
        System.out.println("Meeeeeeew");
    }

    ///// repeat

    String color = "Blue";
    int height = 5;

    public void sayMore(String name1){
        System.out.println("Cat is " + color + " and tall in " + height);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name1='" + name1 + '\'' +
                ", age1=" + age1 +
                ", name2='" + name2 + '\'' +
                ", age2=" + age2 +
                ", name3='" + name3 + '\'' +
                ", age3=" + age3 +
                ", color='" + color + '\'' +
                ", height=" + height +
                '}';
    }










}




