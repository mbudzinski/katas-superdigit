/**
 * Created by Marcin on 2017-05-21.
 */
public class Main {


    public static void main(String[] args) {
        String test = "1234";
        SuperdigitCalculator calculator = new SuperdigitCalculator();
        System.out.println(calculator.calculateSuperDigitOf(test));
        System.out.println(calculator.calculateSuperDigitOf("98741"));
        System.out.println(calculator.calculateSuperDigitOf("123"));
        System.out.println(calculator.calculateSuperDigitOf("65432764378534764946798475643743675262365354657361234115416546876"));
    }

}
