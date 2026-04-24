package org.example.spring_ai.service.Impls;

import org.example.spring_ai.service.DataLoaderService;
import org.springframework.ai.document.Document;
import org.springframework.ai.reader.ExtractedTextFormatter;
import org.springframework.ai.reader.JsonReader;
import org.springframework.ai.reader.pdf.PagePdfDocumentReader;
import org.springframework.ai.reader.pdf.config.PdfDocumentReaderConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DataLoaderServiceImpl implements DataLoaderService {

    @Value("classpath:sample-data.json")
    private Resource jsonResource;

    @Value("classpath:sample-data.pdf")
    private Resource pdfResource;

    @Override
    public List<Document> loadDocumentsFromJson() {
        IO.println("Loading documents from JSON resource: " + jsonResource.getFilename());
        var jsonReader = new JsonReader(jsonResource);
        return jsonReader.read();
    }

    @Override
    public List<Document> loadDocumentsFromPdf() {
        IO.println("Loading documents from PDF resource: " + pdfResource.getFilename());
        var pdfDocumentReader = new PagePdfDocumentReader(pdfResource,
                PdfDocumentReaderConfig.builder()
                        .withPageTopMargin(0)
                        .withPageBottomMargin(0)
                        .withPageExtractedTextFormatter(ExtractedTextFormatter.builder()
                                .withNumberOfTopTextLinesToDelete(0)
                                .withNumberOfBottomTextLinesToDelete(0)
                                .withLeftAlignment(true)
                                .build())
                        .withPagesPerDocument(1)
                        .build()
        );
        return pdfDocumentReader.read();
    }
}
