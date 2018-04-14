package pl.com.empas.java_introductory_course.collections.tasks.task3_salaries_continued;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.OrderedPair;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class DepartamentBudget {

    Map<Departament, List<Employee>> departaments = DepartamentGenerator.getDepartamentsWithEmployeesMap();


    public List<Departament> getBudgetViolatingDepartaments() {
        return null;
    }

    public List<OrderedPair<Departament, Long>> getBudgetViolationsWithAmounts() {
        return null;
    }

    public static void main(String [] args) {
        DepartamentBudget budget = new DepartamentBudget();
        List<Departament> budgetViolations = budget.getBudgetViolatingDepartaments();
        System.out.println(budgetViolations);

        //Dla chętnych
        List<OrderedPair<Departament, Long>> budgetViolationsWithAmounts = budget.getBudgetViolationsWithAmounts();
        System.out.println(budgetViolationsWithAmounts);
    }
}
