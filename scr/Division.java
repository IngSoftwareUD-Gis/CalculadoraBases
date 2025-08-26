public class Division implements Operation {

    @Override
    public NumberClass operate(NumberClass num1, NumberClass num2, int resultBase) {
        NumberClass num1Base10 = num1.convertToBase10();
        NumberClass num2Base10 = num2.convertToBase10();
        int divisionValue = num1Base10.getValue() / num2Base10.getValue();
        NumberClass divisionInResultBase = new NumberClass(divisionValue, 10).convertToBase(resultBase);
        return divisionInResultBase;
    }
    
}
