package pl.com.empas.java_introductory_course.generics.converters;

public class BooleanToStringConverter implements ConverterContract<Boolean, String> {
    public String convert(Boolean value) {
        return value == null ? "false" : value.toString();
    }
}
