import java.util.ArrayList;
import java.util.List;


public class SuperdigitCalculator {


    public long calculateSuperDigitOf(String number) {

        if (number.length() == 1) return Long.valueOf(number);
        List<Long> digits = new ArrayList<>();

        while (number.length() > 0) {
            if (number.length() == 1){
                digits.add(Long.valueOf(number));
                break;
            }

            int twoLastDigits = Integer.valueOf(number.substring(number.length() - 2));
            long digit = twoLastDigits % 10;
            number = number.substring(0, number.length() - 1);
            digits.add(digit);
        }
        String result = digits.stream().reduce(0L,
                                               (a, b) -> a = a + b).toString();
        return calculateSuperDigitOf(result);
    }

}

