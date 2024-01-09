package org.example;

import java.io.IOException;

public class FileNotFoundException extends RuntimeException {
    public FileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
