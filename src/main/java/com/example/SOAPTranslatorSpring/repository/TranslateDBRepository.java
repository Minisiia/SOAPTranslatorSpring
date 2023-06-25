package com.example.SOAPTranslatorSpring.repository;

import com.example.SOAPTranslatorSpring.accessingdatamysql.Translations;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslateDBRepository extends JpaRepository<Translations, Long>{
    @Query(value = "SELECT english_word FROM translations WHERE ukrainian_word = ?", nativeQuery = true)
    String translate(String ukrainian_word);

}
