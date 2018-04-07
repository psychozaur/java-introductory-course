package pl.com.empas.java_introductory_course.generics.converters;

public interface ConverterContract<V, T> {

    public T convert(V value);
}
