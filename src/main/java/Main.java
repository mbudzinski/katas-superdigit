/**
 * Created by Marcin on 2017-05-21.
 */
public class Main {


    public static void main(String[] args) {
        String test = "1234";
        StringManipulator stringManipulator = new StringManipulator();
        SuperdigitCalculator calculator = new SuperdigitCalculator(stringManipulator);
        long totalTime = System.currentTimeMillis();
   //     for (int j = 0; j < 20; j++) {

            long t1 = System.currentTimeMillis();

            for (long i = 0; i < 4000; i++) {
                calculator.calculateSuperDigitOf("326573563785469570947548945434893487639845954695678956789067889758");
            }

            System.out.println("Time1: " + (System.currentTimeMillis() - t1));
            System.out.println(calculator.calculateSuperDigitOf("654327643785347649467984756437436575262365354657361234115416546876"));

            long t2 = System.currentTimeMillis();

            for (long i = 0; i < 4000; i++) {
                calculator.calculateSuperDigit2Of("326573563785469570947548945434893487639845954695678956789067889758");
            }

            System.out.println("Time2: " + (System.currentTimeMillis() - t2));
            System.out.println(calculator.calculateSuperDigit2Of("654327643785347649467984756437436575262365354657361234115416546876"));

            long t3 = System.currentTimeMillis();

            for (long i = 0; i < 4000; i++) {
                calculator.calculateSuperDigit3Of("326573563785469570947548945434893487639845954695678956789067889758");
            }

            System.out.println("Time3: " + (System.currentTimeMillis() - t3));
            System.out.println(calculator.calculateSuperDigit3Of("654327643785347649467984756437436575262365354657361234115416546876"));
   //     }
        System.out.println("Total execution time: " + (System.currentTimeMillis() - totalTime));
        System.out.println(calculator.calculateSuperDigitOf(test));
        System.out.println(calculator.calculateSuperDigitOf("98741"));
        System.out.println(calculator.calculateSuperDigitOf("123"));
        System.out.println(calculator.calculateSuperDigitOf("65432764378534764946798475643743675262365354657361234115416546876"));
    }

}
