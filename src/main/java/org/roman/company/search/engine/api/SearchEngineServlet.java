package org.roman.company.search.engine.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.roman.company.search.engine.bean.MetaData;
import org.roman.company.search.engine.bean.SearchRequest;
import org.roman.company.search.engine.bean.SearchResponse;
import org.roman.company.search.engine.parser.SearchRequestParser;

import com.google.gson.Gson;

public class SearchEngineServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        SearchRequestParser searchRequestParser = new SearchRequestParser();
        SearchRequest searchRequest = searchRequestParser.parse(request);


        // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
        // search in file according to searchRequest
        // get file metadata


        // mock
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
        String json = gson.toJson(searchResponse);

        PrintWriter out = response.getWriter();
        response.setContentType("application/json");
        out.println(json);

        out.close();

    }
}
