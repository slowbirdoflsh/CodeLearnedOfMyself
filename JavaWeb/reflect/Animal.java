public class Animal {
    private String name = "Pig";
    private int age = 3;

    Animal() {}
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("The Animal " + name + " " + age);
    }
}