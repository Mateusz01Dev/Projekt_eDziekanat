package pl.edu.pg;

import java.io.Serializable;

public class Student extends Person implements Savable  {

    private Long id;

    private static Long currentId = 1L;

    private Integer albumNumber;
    private StudentStatus status = StudentStatus.ACTIVE;
    private Score ratings = Score.BEST;

    public Student(String firstName, String lastName, Long pesel, Integer albumNumber) {
        super(firstName, lastName, pesel);
        this.albumNumber = albumNumber;
        id = currentId++;
    }

    public Student() {

    }


    @Override
    public void info() {
        System.out.println("Student" + id);
        System.out.println("imię: " + firstName);
        System.out.println("nazwisko: " + lastName);
        System.out.println("pesel: " + pesel);
        System.out.println("nr albumu: " + albumNumber);
        System.out.println("status: " + status.getValueEN() + status.getValuePL());
        System.out.println("ocena całoroczna: " + ratings.getValueRating() + ratings.getValueRating1() );
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

    public Score getRatings() {
        return ratings;

    }

    public void setRatings(Score ratings) {
        this.ratings = ratings;
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
        allData += ratings + "\n";
        return allData;
    }

    @Override
    public String getFileName() {
        return "student.txt";
    }
}