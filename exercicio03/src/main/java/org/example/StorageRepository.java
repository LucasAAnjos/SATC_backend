package org.example;

public interface StorageRepository {
    void storageCSV(String text);

    String retrieve();
}
