import java.util.ArrayList;
import java.util.List;


public class SuperdigitCalculator {


    private StringManipulator stringManipulator;

    public SuperdigitCalculator(StringManipulator stringManipulator) {
        this.stringManipulator = stringManipulator;
    }

    public long calculateSuperDigitOf(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        List<Long> digits = new ArrayList<>();

        while (number.length() > 0) {
            digits.add(Long.valueOf(stringManipulator.getLastCharFrom(number)));

            if (number.length() == 1){
                break;
            }

            number = stringManipulator.removeLastCharFrom(number);
        }
        String result = calculateSumOf(digits);

        return calculateSuperDigitOf(result);
    }

    String calculateSumOf(List<Long> digits) {
        return digits.stream().reduce(0L,
                (a, b) -> a = a + b).toString();
    }

}

