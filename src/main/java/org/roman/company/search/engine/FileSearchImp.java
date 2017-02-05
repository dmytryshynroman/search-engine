package org.roman.company.search.engine;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.roman.company.search.engine.bean.SearchRequest;

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

    public Set<String> search(final URI filePath, final SearchRequest searchRequest) throws IOException {

        Set<String> result = new LinkedHashSet<String>();
        BufferedReader reader = new BufferedReader(new FileReader("D:\\test.txt"));
        String line;
        while ((line = reader.readLine()) != null) {

            String[] words = line.split(" ");
            for (String word : words) {
                if(word.contains(searchRequest.getText()) && word.length() <= searchRequest.getLength()) {
                    int limit = calculateLimit(result);
                    if (limit >  searchRequest.getLimit()) {
                        return result;
                    }
                    result.add(word);
                }
            }
        }
        return result;
    }


    public Set<String> search1(final URI filePath, final SearchRequest searchRequest) throws IOException {
        Set<String> result = new LinkedHashSet<String>();

        final String regexPrefix = "[^\\s]*";
        final String regex = regexPrefix + searchRequest.getText() + regexPrefix; //+ length;

        BufferedReader reader = new BufferedReader(new FileReader("D:\\test.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            final Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
            final Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                String word = matcher.group();
                if(word.length() <= searchRequest.getLength()) {
                    int limit = calculateLimit(result);
                    if (limit >  searchRequest.getLimit()) {
                        return result;
                    }
                    result.add(word);
                }
            }
        }
        return result;
    }

    private int calculateLimit(Set<String> words) {
        int result = 0;
        for (String value : words) {
            result = result + value.length();
        }
        return result;
    }

}
