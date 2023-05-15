package serialization;
import java.io.Serializable;

public class Person implements Serializable{
    private String name;
    transient private int age; // 0
    private String country;

    public Person(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Person{" + "name=" + name + ", age=" + age + ", country=" + country + '}';
    }
    
}
