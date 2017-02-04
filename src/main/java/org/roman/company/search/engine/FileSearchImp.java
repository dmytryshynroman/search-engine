package org.roman.company.search.engine;

import org.roman.company.search.engine.bean.SearchRequest;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Set;

public class FileSearchImp implements Searcher {

    public static void main(String[] args) throws URISyntaxException {
        /*
        String filePath = "D:\\db.txt"; //new URI("D:\\db.txt");
        String text;
        int limit;
        int length;
        */

        /*
        String filePath = "D:\\db.txt"; //new URI("D:\\db.txt");
        SearchRequest searchRequest = new SearchRequest();
        searchRequest.getText();
        searchRequest.getLimit();
        searchRequest.getLength();
        */


/*
        sdsadsadas hello java
        java ddddddddd 123 123java45
        ddjava ffffffffffffff
        ggggjava@@@@@

        text java
        limit 50
        length 10
                java
                123java45
                ddjava
                ggggjava@@@@@

        text java
        limit 10
        length 10
                java
                ddjava
*/

    }

    public Set<String> search(final URI filePath, final SearchRequest searchRequest) {

        /// !!!!!!

        return null;
    }
}
