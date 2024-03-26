package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;

@Service
public class OscarService {
    ArrayList<Indication> indicates = new ArrayList<>();
    ArrayList<String> dataCSV = new ArrayList<>();
    @Autowired
    StorageRepository storageRepository;
    StorageRepositoryCSV storageRepositoryCSV;
    public void indicate(Indication indication){
        if (indication.getAble()){
            System.out.println("You indicated " + indication.getName() + " to the category " + indication.getCategory());
            indicates.add(indication);
            storageRepository.storageCSV(indication.getName() + "," + indication.getCategory()+"\n");

//            dataCSV.add(indication.getName());
//            dataCSV.add(indication.getCategory());

            //storageRepositoryCSV.storageCSV(dataCSV);
        } else{
            System.out.println("fodase");
        }

    }

    public void listIndicates(){

    }

}
