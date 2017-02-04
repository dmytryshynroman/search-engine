package org.roman.company.search.engine.bean;

public class SearchRequest {

    private String text;
    private int limit;
    private int length;
    boolean isIncludeMetadata;

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(final int limit) {
        this.limit = limit;
    }

    public int getLength() {
        return length;
    }

    public void setLength(final int length) {
        this.length = length;
    }

    public boolean isIncludeMetadata() {
        return isIncludeMetadata;
    }

    public void setIncludeMetadata(final boolean includeMetadata) {
        isIncludeMetadata = includeMetadata;
    }
}
