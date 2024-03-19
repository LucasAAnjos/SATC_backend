package org.example;

import org.springframework.stereotype.Repository;

import java.io.FileOutputStream;
import java.io.PrintWriter;

@Repository
public class FileStorageRepository implements StorageRepository{

    @Override
    public void storage(String text) {
        try{
            FileOutputStream file = new FileOutputStream("pc.txt", true);
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
