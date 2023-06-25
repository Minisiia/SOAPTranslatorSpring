package com.example.SOAPTranslatorSpring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.SOAPTranslatorSpring.repository.TranslateDBRepository;

@Service
public class TranslateDBService {
    private final TranslateDBRepository translateDBRepository;

    @Autowired
    public TranslateDBService(TranslateDBRepository translateDBRepository) {
        this.translateDBRepository = translateDBRepository;
    }

    public String translate(String ukrainian_word) {
        return translateDBRepository.translate(ukrainian_word);
    }
}
