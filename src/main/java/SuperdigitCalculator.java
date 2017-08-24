
public class SuperdigitCalculator {

    public long imperativelyCalculateSuperDigitOf(String number) {
        long longValueOfNumber = Long.valueOf(number);
        handleInvalidInput(longValueOfNumber);

        if (number.length() == 1) return longValueOfNumber;
        long sum = 0;

        char[] test = number.toCharArray();

        for (char character: test) {
            sum += Long.valueOf(String.valueOf(character));
        }

        return imperativelyCalculateSuperDigitOf(String.valueOf(sum));
    }

    public long functionallyCalculateSuperDigitOf(String number) {

        long longValueOfNumber = Long.valueOf(number);
        handleInvalidInput(longValueOfNumber);

        if (number.length() == 1) return longValueOfNumber;
        return functionallyCalculateSuperDigitOf(String.valueOf((number.chars()
                .map(i -> i - 48)
                .reduce(0,
                        (a, b) -> a + b)
        )));
    }

    private void handleInvalidInput(long input) {
        if (input < 0) {
            throw new IllegalArgumentException("Cannot pass numbers less than zero as arguments");
        }
    }

}

