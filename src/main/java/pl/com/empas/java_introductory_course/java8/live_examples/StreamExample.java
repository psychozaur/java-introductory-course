package pl.com.empas.java_introductory_course.java8.live_examples;

import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

    public static class Employee {
        String name;

        public Employee(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Departament {
        String name;

        public Departament(String name, List<Employee> employess) {
            this.name = name;
            this.employess = employess;
        }

        List<Employee> employess;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public List<Employee> getEmployess() {
            return employess;
        }

        public void setEmployess(List<Employee> employess) {
            this.employess = employess;
        }
    }

    public static void main(String [] args) {
        Stream<Employee> hrEmployeeStream;//= Stream.of()
     }
}
