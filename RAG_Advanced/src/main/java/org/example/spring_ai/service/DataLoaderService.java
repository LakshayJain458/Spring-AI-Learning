package org.example.spring_ai.service;

import org.springframework.ai.document.Document;

import java.util.List;

public interface DataLoaderService {
    public List<Document> loadDocumentsFromJson();

    public List<Document> loadDocumentsFromPdf();
}
