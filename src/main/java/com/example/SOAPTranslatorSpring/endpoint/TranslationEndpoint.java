package com.example.SOAPTranslatorSpring.endpoint;

import com.example.SOAPTranslatorSpring.service.TranslateDBService;
import com.example.translator.TranslationRequest;
import com.example.translator.TranslationResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class TranslationEndpoint {
    private static final String NAMESPACE_URI = "http://example.com/translator";
        private final TranslateDBService translateDBService ;
@Autowired
    public TranslationEndpoint(TranslateDBService translateDBService) {
        this.translateDBService = translateDBService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "TranslationRequest")
    @ResponsePayload
    public TranslationResponse translation(@RequestPayload TranslationRequest request) {
        TranslationResponse response = new TranslationResponse();
        response.setTranslatedWord(translateDBService.translate(request.getWord()));
        return response;
    }
}