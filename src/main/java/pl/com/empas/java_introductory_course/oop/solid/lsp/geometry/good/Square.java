package pl.com.empas.java_introductory_course.oop.solid.lsp.geometry.good;

public class Square {
    protected int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public Square(int length) {

        this.length = length;
    }
}
