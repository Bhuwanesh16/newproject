package com.examly.springapp.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.examly.springapp.entities.Language;
import com.examly.springapp.services.LanguageService;

@RestController
@RequestMapping("/api/languages")
public class LanguageController {

    private final LanguageService languageService;

    public LanguageController(LanguageService languageService) {
        this.languageService = languageService;
        }

        @GetMapping("/sorted")
        public List<Language> getSortedLanguages(
            @RequestParam(defaultValue = "name") String sortBy,
            @RequestParam(defaultValue = "asc") String sortDir) {
                return languageService.getLanguagesSorted(sortBy, sortDir);
                }

        @PostMapping
        public ResponseEntity<Language> createLanguage(@RequestBody Language language) {
            Language createdLanguage = languageService.createLanguage(language);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdLanguage);
        }

        @DeleteMapping("/{id}")
        public ResponseEntity<Void> deleteLanguage(@PathVariable Long id) {
            boolean deleted = languageService.deleteLanguage(id);
            if (deleted) {
                return ResponseEntity.noContent().build();
            }
            return ResponseEntity.notFound().build();
        }
                }