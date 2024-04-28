public class ValueConverter {
    private String base_code;
    private String target_code;
    private double conversion_result;
    private double conversion_rate;

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
    public double getConversion_rate() {
        return conversion_rate;
    }

// ToString
    @Override
    public String toString() {
        return String.format("""
                %.3f %s converted to %s equals to: %.3f.
                """, (this.conversion_result / this.conversion_rate), this.base_code, this.target_code, this.conversion_result);
    }
}
