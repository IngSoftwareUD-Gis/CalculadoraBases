public class Multiplication implements Operation {

    @Override
    public NumberClass operate(NumberClass num1, NumberClass num2, int resultBase) {
        NumberClass num1Base10 = num1.convertToBase10();
        NumberClass num2Base10 = num2.convertToBase10();
        int multiplicationValue = num1Base10.getValue() * num2Base10.getValue();
        NumberClass multiplicationInResultBase = new NumberClass(multiplicationValue, 10).convertToBase(resultBase);
        return multiplicationInResultBase;
    }
    
}
