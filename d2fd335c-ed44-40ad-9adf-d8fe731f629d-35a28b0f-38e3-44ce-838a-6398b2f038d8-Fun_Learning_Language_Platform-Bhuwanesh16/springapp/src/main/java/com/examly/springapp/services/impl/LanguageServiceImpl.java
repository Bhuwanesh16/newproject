package com.examly.springapp.services.impl;

import com.examly.springapp.entities.Language;
import com.examly.springapp.repositories.LanguageRepository;
import com.examly.springapp.services.LanguageService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LanguageServiceImpl implements LanguageService {
    private final LanguageRepository languageRepository;

    public LanguageServiceImpl(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }

    @Override
    public Language createLanguage(Language language) {
        return languageRepository.save(language);
        }

        @Override
        public List<Language> getAllLanguages() {
            return languageRepository.findAll();
            }

            @Override
            public Language getLanguageById(Long id) {
                return languageRepository.findById(id).orElse(null);
                }

                @Override
                public Language updateLanguage(Long id, Language language) {
                    Optional<Language> existingLanguage = languageRepository.findById(id);
                    if (existingLanguage.isPresent()) {
                    Language updatedLanguage = existingLanguage.get();
                    updatedLanguage.setName(language.getName());
                    return languageRepository.save(updatedLanguage);
                    }
                    return null;
                    }

                   @Override
                   public boolean deleteLanguage(Long id) {
                    if (languageRepository.existsById(id)) {
                        languageRepository.deleteById(id);
                        return true;
                        }
                        return false;
                        }
                    
                   

                    @Override
                    public List<Language> getLanguagesSorted(String sortBy, String sortDir) {
                        
                        throw new UnsupportedOperationException("Unimplemented method 'getLanguagesSorted'");
                    }
                    }