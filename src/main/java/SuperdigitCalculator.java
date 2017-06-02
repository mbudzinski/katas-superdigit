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

    public long calculateSuperDigit2Of(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        long sum = 0;

        for (int i = 0; i < number.length(); i++) {
            sum += Long.valueOf(String.valueOf(number.charAt(i)));
        }
        String result = String.valueOf(sum);

        return calculateSuperDigit2Of(result);
    }

    public long calculateSuperDigit3Of(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        return calculateSuperDigit3Of(String.valueOf((number.chars()
                .map(i -> i - 48)
                .reduce(0,
                        (a, b) -> a + b)
        )));

    }
}

