package pl.com.empas.java_introductory_course.oop.solid.common;

public class ExcelDocument extends OfficeDocument {

    public ExcelDocument(String fileName, long fileSize, OfficeVersion version, byte [] content) {
        super(fileName, fileSize, version, content);
    }

    public ExcelDocument reevaluateFormulas() {
        return new ExcelDocument(fileName, fileSize, officeVersion, content);
        //Actually we would have to do much more than just create a new document, but for now it must suffice.
    }
}
