package pl.com.empas.java_introductory_course.generics.converters;

public interface ConverterContract<V, T> {

    T convert(V value);
}
