package pl.com.empas.java_introductory_course.collections.common;

public class Departament {

    public Departament(String name, Long budget) {
        this.name = name;
        this.budget = budget;
    }

    private final String name;
    private final Long budget;

    @Override
    public String toString() {
        return "Departament{" +
                "name='" + name + '\'' +
                ", budget=" + budget +
                '}';
    }

    public String getName() {
        return name;
    }

    public Long getBudget() {
        return budget;
    }
}
