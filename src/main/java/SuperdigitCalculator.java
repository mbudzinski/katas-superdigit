public class SuperdigitCalculator {


    private StringManipulator stringManipulator;

    public SuperdigitCalculator(StringManipulator stringManipulator) {
        this.stringManipulator = stringManipulator;
    }

    public long calculateSuperDigitOf(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        long sum = 0;

        while (number.length() > 0) {
            sum = sum + Long.valueOf(stringManipulator.getLastCharFrom(number));

            if (number.length() == 1){
                break;
            }

            number = stringManipulator.removeLastCharFrom(number);
        }
        String result = String.valueOf(sum);

        return calculateSuperDigitOf(result);
    }

}

