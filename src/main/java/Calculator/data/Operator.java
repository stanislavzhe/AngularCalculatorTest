package Calculator.data;

/**
 * Created by Stas on 15.10.2018.
 */
//TODO add enum to tests
public enum Operator {
    ADDITION("+"),
    SUBTRACTION("-");

    private String description;

    private Operator(String description) {
        this.description = description;
    }

    public String getDescription() {
        return ADDITION.description;
    }
}
