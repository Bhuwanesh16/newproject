package com.examly.springapp.services;

import com.examly.springapp.entities.Language;
import java.util.List;
public interface LanguageService {

List <Language> getLanguagesSorted (String sortBy, String sortDir); 
// Language methods
Language createLanguage(Language language);
List<Language> getAllLanguages();
Language getLanguageById(Long id);
Language updateLanguage(Long id, Language language);

boolean deleteLanguage(Long id);
}
  
