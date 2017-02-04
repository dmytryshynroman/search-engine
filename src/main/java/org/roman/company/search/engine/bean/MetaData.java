package org.roman.company.search.engine.bean;

public class MetaData {
    private String fileName;
    private String fileSize;
    private String fileCreationDate;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(final String fileName) {
        this.fileName = fileName;
    }

    public String getFileSize() {
        return fileSize;
    }

    public void setFileSize(final String fileSize) {
        this.fileSize = fileSize;
    }

    public String getFileCreationDate() {
        return fileCreationDate;
    }

    public void setFileCreationDate(final String fileCreationDate) {
        this.fileCreationDate = fileCreationDate;
    }
}
