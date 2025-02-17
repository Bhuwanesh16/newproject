package com.examly.springapp.configuration;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class LogConfig {
    private static final String LOG_FOLDER_PATH = "logs";
    private static final String LOG_FILE_PATH = "logs/application.log";

    @PostConstruct
    public void initializeLogFiles() {
        try {
            // Create logs directory if it doesn't exist
            File logFolder = new File(LOG_FOLDER_PATH);
            if (!logFolder.exists()) {
                logFolder.mkdir();
            }

            // Create application.log file if it doesn't exist
            File logFile = new File(LOG_FILE_PATH);
            if (!logFile.exists()) {
                logFile.createNewFile();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}