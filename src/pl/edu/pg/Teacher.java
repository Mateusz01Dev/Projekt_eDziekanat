package pl.edu.pg;

public class Teacher extends Person implements Savable {

    private String degree;
    private Long id;

    private static Long currentId = 1L;

    public Teacher(String firstName, String lastName, Long pesel) {
        super(firstName, lastName, pesel);
        id = currentId++;
    }

    @Override
    public void info() {
        System.out.println("Nauczyciel " + id);
        System.out.println("imię: " + firstName);
        System.out.println("nazwisko: " + lastName);
        System.out.println("pesel: " + pesel);
        System.out.println("stopień: " + degree);
        System.out.println();       // wypisz linię odstępu
    }

    public String getAllData(){
        String allData = "";
        allData += "Teacher " + id + "\n";
        allData += firstName + "\n";
        allData += lastName + "\n";
        allData += pesel + "\n";
        allData += degree + "\n";
        return allData;
    }

    @Override
    public String getFileName() {
        return "teacher.txt";
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    ////////////////////////// gettery i settery //////////////////////////

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }
}
