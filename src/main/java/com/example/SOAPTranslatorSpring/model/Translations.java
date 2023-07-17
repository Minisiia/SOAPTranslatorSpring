package com.example.SOAPTranslatorSpring.model;

import jakarta.persistence.*;
@Entity
@Table(name = "translations")
public class Translations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ukrainianWord;
    private String englishWord;

    public Translations() {
    }

    public Translations(String ukrainianWord, String englishWord) {
        this.ukrainianWord = ukrainianWord;
        this.englishWord = englishWord;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUkrainianWord() {
        return ukrainianWord;
    }

    public void setUkrainianWord(String ukrainianWord) {
        this.ukrainianWord = ukrainianWord;
    }

    public String getEnglishWord() {
        return englishWord;
    }

    public void setEnglishWord(String englishWord) {
        this.englishWord = englishWord;
    }
}
