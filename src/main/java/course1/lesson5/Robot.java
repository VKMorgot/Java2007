package course1.lesson5;

public class Robot {

    private String name;
    private int age;

    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void info() {
        System.out.println("Name = " + name + " age = " + age);
    }
}
