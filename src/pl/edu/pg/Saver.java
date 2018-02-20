package pl.edu.pg;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Saver implements Savable  {

    public String firstNameNew;
    public String lastNameNew;
    public Long peselNew;

    public static void main (String[] args) throws FileNotFoundException {

        PrintWriter zapis = new PrintWriter("newStudent.txt");

    }


    @Override
    public String getAllData() {

        String allData = "";
        allData += firstNameNew + "\n";
        allData += lastNameNew;
        allData += peselNew;
        return allData;
    }

    @Override
    public String getFileName() {
        return "newStudent.txt";
    }
}
