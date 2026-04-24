package org.example.spring_ai.service.Impls;

import org.example.spring_ai.service.DataTransformerService;
import org.springframework.ai.document.Document;
import org.springframework.ai.transformer.splitter.TokenTextSplitter;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataTransformerServiceImpl implements DataTransformerService {
    @Override
    public List<Document> transformDocuments(List<Document> documents) {
        var splitter = new TokenTextSplitter();
        return splitter.transform(documents);
    }
}
