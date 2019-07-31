public class Person {
    private String name = "admin";
    private int age = 18;

    Person() {}
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("The Person " + name + " " + age);
    }
}