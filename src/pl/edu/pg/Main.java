package pl.edu.pg;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Teacher t = new Teacher("Janusz"
                , "Kowalski"
                , 231231231L);
        t.setDegree("dr hab.");

        Student s = new Student("Adam"
                , "Nowak", 231231231L
                , 123123);
        s.setStatus(StudentStatus.ON_BREAK);


        Set<Person> people = new HashSet<>();
        people.add(t);
        people.add(s);
        people.add(new Teacher(
                "Jan"
                , "Kowal"
                , 3123123L));




        for (Person person : people) {
            person.info();
        }

        Subject sub = new Subject("Algebra liniowa");
        Subject sub1 = new Subject("Biochemia");

        Teacher t1 = new Teacher("Jan", "Kowal",3123123L);
        t1.setDegree("dr");

        FileManager fileManager = new FileManager();
        fileManager.save(t);
        fileManager.save(t1);
        fileManager.save(s);
        fileManager.save(sub);
        fileManager.save(sub1);

        System.out.println(t);
        System.out.println(s);
        System.out.println(s.hashCode());


        System.out.println(s.equals(t));


        Map<Long, Person> personMap = new HashMap<>();
        personMap.put(t.getPesel(), t);

        System.out.println(personMap.get(231231231L));
    }
}
