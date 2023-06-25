package com.example.SOAPTranslatorSpring.endpoint;

import com.example.translator.TranslationRequest;
import com.example.translator.TranslationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import repository.TranslateRepository;

@Endpoint
public class TranslationEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/translator";

    private final TranslateRepository translateRepository;
    @Autowired
     public TranslationEndpoint(TranslateRepository translateRepository) {
        this.translateRepository = translateRepository;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TranslationRequest")
    @ResponsePayload
    public TranslationResponse translation(@RequestPayload TranslationRequest request) {
        TranslationResponse response = new TranslationResponse();
        response.setTranslatedWord(translateRepository.translate(request.getWord()));
        return response;
    }
}