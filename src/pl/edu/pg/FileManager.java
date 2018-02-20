package pl.edu.pg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    void save(Savable objectToSave){

        File file = new File(objectToSave.getFileName());
        try {
            FileWriter fr = new FileWriter(file, true);
            fr.write(objectToSave.getAllData());
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}