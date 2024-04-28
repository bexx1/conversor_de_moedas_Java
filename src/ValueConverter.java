public class ValueConverter {
    private String base_code;
    private String target_code;
    private double conversion_result;

// CONSTRUCTOR
    public ValueConverter(String base_code, String target_code, double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_result = conversion_result;
    }

    // GETTERS
    public String getBaseCode() {
        return base_code;
    }
    public String getTargetCode() {
        return target_code;
    }
    public double getConversionResult() {
        return conversion_result;
    }

// ToString

    @Override
    public String toString() {
        return "ValueConverter{" +
                "currencyFrom='" + base_code + '\'' +
                ", currencyTo='" + target_code + '\'' +
                ", value='" + conversion_result + '\'' +
                '}';
    }
}
