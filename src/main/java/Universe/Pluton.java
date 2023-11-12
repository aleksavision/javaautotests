package Universe;

import java.util.Arrays;
import java.util.List;

public class Pluton {

    private long id;
    private String firstName;
    private String lastName;
    private int age;
    private String nationality;

//    public Pluton(long id, String firstName, String lastName, int age, String nationality){
//        this.id = id;
//        this.firstName = firstName;
//        this.lastName = lastName;
//        this.age = age;
//        this.nationality = nationality;
//    }

    public Pluton (int age){
        this.age = age;
    }

    @Override
    public String toString() {
        return "Pluton{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nationality='" + nationality + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void box(){
        System.out.println("This is for autotest");
    }

    public String boxBox(String voice){
        return voice;
    }
}









