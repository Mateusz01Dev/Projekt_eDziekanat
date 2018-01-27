package pl.edu.pg;

/**
 * Typ wyliczeniowy określający aktualny status studenta
 */
public enum StudentStatus {
    /**
     * Oznacza, że student jest aktywny
     */
    ACTIVE("Aktywny", "Active"),
    /**
     * Oznacza, że student jest skreślony
     */
    DELETED("Skreślony", "Deleted"),
    /**
     * Oznacza, że student jest urlopowany
     */
    ON_BREAK("Urlopowany", "On break");

    private String valuePL;
    private String valueEN;

    StudentStatus(String valuePL, String valueEN) {
        this.valuePL = valuePL;
        this.valueEN = valueEN;
    }

    public String getValuePL() {
        return valuePL;
    }

    public String getValueEN() {
        return valueEN;
    }
}
