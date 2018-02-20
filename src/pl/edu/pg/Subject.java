package pl.edu.pg;

public class Subject implements Savable {

    private Long id;

    private static Long currentId = 1L;

    private String name;

    private String ects;

    public Subject(String name, String ects) {
        this.name = name;
        this.ects = ects;
        id = currentId++;
    }

    public String getName() {
        return name;
    }

    public String getEcts(){

        return ects;

    }

    public void setEcts(String s) {

    }

    @Override
    public String getAllData() {
        String allData = "";
        allData += "Subject " + id + "\n";
        allData += name + "\n";
        allData += "Punkty ects" + ects;

        return allData;
    }



    @Override
    public String getFileName() {
        return "subject.txt";
    }

}