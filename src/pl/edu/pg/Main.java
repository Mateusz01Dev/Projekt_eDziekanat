package pl.edu.pg;

import java.io.*;
import java.util.*;

public class Main extends Saver implements Serializable {

    public static boolean variable;

    public static void main(String[] args) throws FileNotFoundException {



        Student s = new Student("Adam"
                , "Nowak", 231231231L
                , 123123);
        s.setStatus(StudentStatus.ON_BREAK);
        s.setRatings(Score.BEST);



        Student s2 = new Student("Michał", "As", 265176432L, 543216);

        s2.setStatus(StudentStatus.ACTIVE);
        s2.setRatings(Score.MEDIUM);

        Student s3 = new Student("Ania", "Os", 2323233452L, 123456);

        s3.setRatings(Score.BEST);

        Subject sub = new Subject("Algebra liniowa", "10");

        Subject sub1 = new Subject("Biochemia", "8");


        System.out.println("Witam w portalu eDziekanat, dla ułatwienia na końcu wyświetli się lista nauczycieli prowadzących zajęcia, aby przejść dalej wpisz dalej: ");

        Scanner sc = new Scanner(System.in);

        String enter = sc.nextLine();

        if(enter.equals("dalej")) {

            System.out.println("\n" + "Menu" + "\n" + "\n" + "a - search student in data base" + "\n" + "\n" + "b - add data of new student" + "\n" + "\n" + "c - remove student from data base" + "\n" + "\n" + "d - show all students" + "\n" + "\n" + "e - show subjects and their ects");

            String choice = sc.nextLine();

            if (choice.equals("a")){

                System.out.println();

                System.out.println("Informacja: Na końcu zawsze wyśwetli się lista nauczycieli prowadzących zajęcia dla studenta" + "\n" + "\n" + "Wpisz imię studenta, którego chcesz wyszukać: ");

                String studName = sc.nextLine();

                if(studName.equals("Adam")){

                    System.out.println("\n" + s.firstName + "\n" + s.lastName + "\n" +  s.pesel + "\n" + s.getStatus() + "\n");
                }

                else {

                    System.out.println("Nie znaleziono studenta, spróbuj ponownie: ");

                    String studName2try = sc.nextLine();

                    if(studName2try.equals("Adam")){

                        System.out.println("\n" + s.firstName + "\n" + s.lastName + "\n" +  s.pesel + "\n" + s.getStatus() + "\n");
                    }

                    else {

                        System.out.println("Przekroczono dopuszczalną ilość prób, zamykam program");

                        System.exit(0);
                    }

                }

            }

            else if (choice.equals("b")){

                Scanner input = new Scanner(System.in);

                System.out.println("Wprowadź imię studenta: ");

                String firstNameNew = input.nextLine();

                String adder = sc.nextLine();

                PrintWriter zapis = new PrintWriter("newStudent.txt");

                zapis.print(firstNameNew + "\n");

                System.out.println("Wprowadź nazwisko studenta: ");

                String lastNameNew = input.nextLine();

                zapis.print(lastNameNew + "\n");

                System.out.println("Wprowadź pesel studenta: ");

                Long peselNew = Long.valueOf(input.nextLine());

                zapis.print(peselNew + "\n");

                zapis.close();

                Scanner odczyt = new Scanner(new File("newStudent.txt"));

                System.out.println(odczyt.nextLine());



            }

            else if (choice.equals("c")){

                System.out.println("Wprowadź imię studenta, którego chcesz usunąć z bazy: ");

                String firstNameR = sc.nextLine();

                if(firstNameR.equals("Adam"))  {

                    Student student2 = new Student();
                }

            }

            else if (choice.equals("d")){

                System.out.println("\n" + "Lista studentów" + "\n" + s.firstName + "\n" + s.lastName + "\n" +  s.pesel + "\n" + s.getStatus() + "\n" + s.getRatings() + "\n" + "\n" + s2.firstName + "\n" + s2.lastName + "\n" +  s2.pesel + "\n" + s.getStatus() + "\n" + s2.getRatings() + "\n" + "\n" + s3.firstName + "\n" + s3.lastName + "\n" +  s3.pesel + "\n" + s3.getStatus() + "\n" + s3.getRatings());
            }

            else if (choice.equals("e")){

                System.out.println("\n" + "Lista przedmiotów" + "\n" + sub.getAllData() + "\n" + sub1.getAllData() );

            }
        }

        else {

            System.out.println("Zamykam program");

            System.exit(0);
        }

        System.out.println("\n" + "Lista nauczycieli prowadzących zajecia" + "\n");

        Teacher t = new Teacher("Janusz"
                , "Kowalski"
                , 231231231L);
        t.setDegree("dr hab.");


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

        Teacher t1 = new Teacher("Jan", "Kowal",3123123L);
        t1.setDegree("dr");

        FileManager fileManager = new FileManager();
        fileManager.save(t);
        fileManager.save(t1);
        fileManager.save(s);
        fileManager.save(s2);
        fileManager.save(s3);
        fileManager.save(sub);
        fileManager.save(sub1);





    }
}