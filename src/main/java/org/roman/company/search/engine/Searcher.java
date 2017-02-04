package org.roman.company.search.engine;

import java.net.URI;
import java.util.Set;

import org.roman.company.search.engine.bean.SearchRequest;

public interface Searcher {
    Set<String> search(URI filePath, SearchRequest searchRequest);
}
