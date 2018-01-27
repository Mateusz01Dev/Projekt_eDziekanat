package pl.edu.pg;

public abstract class Person {

    protected String firstName;
    protected String lastName;
    protected Long pesel;

    public Person(String firstName, String lastName, Long pesel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
    }

    @Override
    public int hashCode() {
        return pesel.intValue();
    }

    @Override
    public boolean equals(Object o) {
        boolean result = false;

        if (o instanceof Person){
            Person per = (Person)o;
            if (per.pesel.equals(this.pesel)){
                result = true;
            }
        }
        return result;
    }

    public abstract void info();

    ////////////////////////// gettery i settery //////////////////////////

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getPesel() {
        return pesel;
    }
}
