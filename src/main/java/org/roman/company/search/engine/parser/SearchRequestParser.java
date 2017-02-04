package org.roman.company.search.engine.parser;

import javax.servlet.http.HttpServletRequest;

import org.roman.company.search.engine.bean.SearchRequest;

public class SearchRequestParser {

    public SearchRequest parse(HttpServletRequest request) {
        SearchRequest result = new SearchRequest();

        String text = request.getParameter("q");
        String limit = request.getParameter("limit");
        String length = request.getParameter("length");
        String includeMetaData = request.getParameter("includeMetaData");

        result.setText(text);
        result.setLimit(Integer.valueOf(limit));
        result.setLength(Integer.valueOf(length));
        result.setIncludeMetadata(Boolean.valueOf(includeMetaData));

        return result;
    }
}
