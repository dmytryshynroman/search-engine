package org.roman.company.search.engine.bean;

import java.util.List;

public class SearchResponse {

    private List<String> text;

    private MetaData metaData;

    public List<String> getText() {
        return text;
    }

    public void setText(final List<String> text) {
        this.text = text;
    }

    public MetaData getMetaData() {
        return metaData;
    }

    public void setMetaData(final MetaData metaData) {
        this.metaData = metaData;
    }
}
