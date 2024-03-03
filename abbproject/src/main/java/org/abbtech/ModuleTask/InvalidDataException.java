package org.abbtech.ModuleTask;

public class InvalidDataException extends CustomException {
    public InvalidDataException(String message) {
        super(message);
    }

        public static class FileIOException extends CustomException {
        public FileIOException(String message) {
            super(message);
        }
    }
}
