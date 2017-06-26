
public class SuperdigitCalculator {

    public long imperativelyCalculateSuperDigitOf(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        long sum = 0;

        char[] test = number.toCharArray();

        for (char character: test) {
            sum += Long.valueOf(String.valueOf(character));
        }

        return imperativelyCalculateSuperDigitOf(String.valueOf(sum));
    }

    public long functionallyCalculateSuperDigitOf(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        return functionallyCalculateSuperDigitOf(String.valueOf((number.chars()
                .map(i -> i - 48)
                .reduce(0,
                        (a, b) -> a + b)
        )));
    }

}

