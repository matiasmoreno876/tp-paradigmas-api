package com.example.paradigmas.services;

import com.example.paradigmas.models.Documento;
import com.example.paradigmas.services.interfaces.IDocumentService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class DocumentServiceImpl implements IDocumentService {

    @Override
    public List<Documento> getAllDocuments() {
        //implements factory
        return null;
    }
}
