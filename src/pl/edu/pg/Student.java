package pl.edu.pg;

public class Student extends Person implements Savable {

    private Long id;

    private static Long currentId = 1L;

    private Integer albumNumber;
    private StudentStatus status = StudentStatus.ACTIVE;

    public Student(String firstName, String lastName, Long pesel, Integer albumNumber) {
        super(firstName, lastName, pesel);
        this.albumNumber = albumNumber;
        id = currentId;
    }

    @Override
    public void info() {
        System.out.println("Student" + id);
        System.out.println("imię: " + firstName);
        System.out.println("nazwisko: " + lastName);
        System.out.println("pesel: " + pesel);
        System.out.println("nr albumu: " + albumNumber);
        System.out.println("status: " + status.getValueEN());
        System.out.println();       // wypisz linię odstępu
    }

    ////////////////////////// gettery i settery //////////////////////////

    public Integer getAlbumNumber() {
        return albumNumber;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }

    @Override
    public String getAllData() {
        String allData = "";
        allData += "Student " + id + "\n";
        allData += firstName + "\n";
        allData += lastName + "\n";
        allData += pesel + "\n";
        allData += albumNumber + "\n";
        allData += status + "\n";
        return allData;
    }

    @Override
    public String getFileName() {
        return "student.txt";
    }
}
