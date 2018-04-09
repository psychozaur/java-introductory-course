package pl.com.empas.java_introductory_course.oop.solid.lsp.documents.good;

import java.util.Arrays;

public abstract class BinaryDocument {

    protected final String fileName;

    protected byte [] content;
    protected long fileSize;

    public BinaryDocument(String fileName, long fileSize, byte [] content) {
        this.fileName = fileName;
        this.fileSize = fileSize;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BinaryDocument that = (BinaryDocument) o;

        if (fileSize != that.fileSize) return false;
        if (fileName != null ? !fileName.equals(that.fileName) : that.fileName != null) return false;
        return Arrays.equals(content, that.content);
    }

    @Override
    public int hashCode() {
        int result = fileName != null ? fileName.hashCode() : 0;
        result = 31 * result + Arrays.hashCode(content);
        result = 31 * result + (int) (fileSize ^ (fileSize >>> 32));
        return result;
    }

    public byte [] getContent() {
        return this.content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public String getFileName() {
        return fileName;
    }

    public long getFileSize() {
        return fileSize;
    }

    public void setFileSize(long fileSize) {
        this.fileSize = fileSize;
    }



}
