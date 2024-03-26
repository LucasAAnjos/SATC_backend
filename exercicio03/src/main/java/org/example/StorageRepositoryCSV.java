package org.example;

import java.util.ArrayList;

public interface StorageRepositoryCSV {
    void storageCSV(ArrayList<String> text);
    String retrieve();
}
