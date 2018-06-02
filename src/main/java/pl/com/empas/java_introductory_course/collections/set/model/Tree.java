package pl.com.empas.java_introductory_course.collections.set.model;

public class Tree {
    private String type;
    private int age;

    public Tree(String type, int age) {
        this.type = type;
        this.age = age;
    }

    public String getType() {
        return type;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "type='" + type + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
