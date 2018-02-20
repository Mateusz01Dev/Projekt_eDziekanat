package pl.edu.pg;

public enum  Score {

    BEST("Bardzo dobry", "5.0"),

    MEDIUM("Dobry", "4.0"),

    LOW("Dostateczny", "3.0");

    private String valueRating;
    private String valueRating1;

    Score(String valueRating, String valueRating1) {
        this.valueRating = valueRating;
        this.valueRating1 = valueRating1;

    }

    public String getValueRating() {
        return valueRating;
    }

    public String getValueRating1() {

        return valueRating1;

    }

}

