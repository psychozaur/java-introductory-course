package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.good;

public class ExcelDocument extends BinaryDocument {

    public ExcelDocument(String fileName, long fileSize, byte [] content) {
        super(fileName, fileSize, content);
    }
}
