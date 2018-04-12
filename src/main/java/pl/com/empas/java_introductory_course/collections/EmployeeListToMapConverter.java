package pl.com.empas.java_introductory_course.collections;

import pl.com.empas.java_introductory_course.generics.converters.ConverterContract;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeListToMapConverter implements
        ConverterContract<List<? extends HashMapCollisionExample.Employee>, Map<String, ? extends HashMapCollisionExample.Employee>> {
    @Override
    public Map<String, ? extends HashMapCollisionExample.Employee> convert(List<? extends HashMapCollisionExample.Employee> value) {
        Map<String, HashMapCollisionExample.Employee> map = new HashMap<>();
        for(HashMapCollisionExample.Employee elem : value) {
            map.put(elem.employeeNumber, elem);
        }
        return map;
    }
}
