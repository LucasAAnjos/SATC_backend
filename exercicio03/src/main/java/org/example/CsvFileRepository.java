//package org.example;
//
//import org.springframework.stereotype.Repository;
//
//import java.io.File;
//import java.io.PrintWriter;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//@Repository
//public class CsvFileRepository implements StorageRepositoryCSV {
//    private List<String[]> dataCSV  = new ArrayList<>();
//    @Override
//    public void storageCSV(List<String[]> text) {
//        File csvOutputFile = new File("Indicados");
//        dataCSV.add(text);
//
//        try (PrintWriter pw = new PrintWriter(csvOutputFile)) {
//            dataCSV.stream()
//                    .map(this::convertToCSV)
//                    .forEach(pw::println);
//        } catch (Exception exception) {
//            System.out.println("Failed to create file! " + exception);
//        }
//    }
//
//    public String convertToCSV(String[] data){
//        return Stream.of(data)
//                .collect(Collectors.joining(","));
//    }
//
//    @Override
//    public String retrieve(){return null;};
//}
//
