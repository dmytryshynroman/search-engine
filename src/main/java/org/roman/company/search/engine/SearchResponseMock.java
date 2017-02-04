package org.roman.company.search.engine;

import java.util.ArrayList;
import java.util.List;

import org.roman.company.search.engine.bean.MetaData;
import org.roman.company.search.engine.bean.SearchResponse;

import com.google.gson.Gson;

public class SearchResponseMock {

    public static void main(String[] args) {
        SearchResponse searchResponse = new SearchResponse();
        List<String> text = new ArrayList<String>();
        text.add("java");
        text.add("javac");
        MetaData metaData = new MetaData();
        metaData.setFileName("javaLangSpec.txt");
        metaData.setFileSize("900KB");
        metaData.setFileCreationDate("January 23, 1996 at 12: 52PM");
        searchResponse.setText(text);
        searchResponse.setMetaData(metaData);

        Gson gson = new Gson();

        System.out.println(gson.toJson(searchResponse));
    }
}
