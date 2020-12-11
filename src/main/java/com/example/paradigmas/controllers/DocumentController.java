package com.example.paradigmas.controllers;

import com.example.paradigmas.models.Documento;
import com.example.paradigmas.services.interfaces.IDocumentService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/documents")
@AllArgsConstructor
public class DocumentController {

    private final IDocumentService documentService;

    @GetMapping()
    public ResponseEntity getAllDocuments() {
        try {
            List<Documento> documentos = this.documentService.getAllDocuments();
            return (!documentos.isEmpty())
                    ? ResponseEntity.ok().body(documentos)
                    : ResponseEntity.noContent().build();
        } catch (Exception e) {
            return ResponseEntity.noContent().build();
        }
    }


}
