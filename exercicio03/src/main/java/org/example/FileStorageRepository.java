package org.example;

import org.springframework.stereotype.Repository;

import java.io.FileOutputStream;
import java.io.PrintWriter;

@Repository
public class FileStorageRepository implements StorageRepository{

    @Override
    public void storageCSV(String text) {
        try{
            FileOutputStream file = new FileOutputStream("oscar.txt", true);
            PrintWriter printWriter = new PrintWriter(file);
            printWriter.append(text);
            printWriter.close();
        } catch (Exception exception) {
            System.out.println("Failed to create file! " + exception);
        }

    }

    @Override
    public String retrieve() {
        return null;
    }
}
