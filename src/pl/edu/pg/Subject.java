package pl.edu.pg;

public class Subject implements Savable {

    private Long id;

    private static Long currentId = 1L;

    private String name;

    public Subject(String name) {
        this.name = name;
        id = currentId++;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getAllData() {
        String allData = "";
        allData += "Subject " + id + "\n";
        allData += name + "\n";

        return allData;
    }

    @Override
    public String getFileName() {
        return "subject.txt";
    }
}
