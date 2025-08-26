public class NumberClass {

    private final int value;
    private final int base;

    public NumberClass(int value, int base) {
        this.value = value;
        this.base = base;
    }

    public int getValue() {
        return value;
    }

    public int getBase() {
        return base;
    }

    public NumberClass convertToBase10(){
        int decimalValue = Integer.parseInt(String.valueOf(value), base);
        return new NumberClass(decimalValue, 10);
    }

    public NumberClass convertToBase(int newBase){
        NumberClass numeroBase10 = this.convertToBase10();
        int valueInNewBase = Integer.parseInt(Integer.toString(numeroBase10.getValue()), newBase);
        return new NumberClass(valueInNewBase, newBase);
    }

    @Override
    public String toString() {
        return value + " (base " + base + ")";
    }
    
}
