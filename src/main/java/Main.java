/**
 * Created by Marcin on 2017-05-21.
 */
public class Main {


    public static void main(String[] args) {

        SuperdigitCalculator calculator = new SuperdigitCalculator();

        long totalTime = System.currentTimeMillis();
        for (int j = 0; j < 20; j++) {

            long t2 = System.currentTimeMillis();

            for (long i = 0; i < 4000000; i++) {
                calculator.imperativelyCalculateSuperDigitOf("326573563785469570947548945434893487639845954695678956789067889758");
            }

            System.out.println("Time2: " + (System.currentTimeMillis() - t2));
            System.out.println(calculator.imperativelyCalculateSuperDigitOf("654327643785347649467984756437436575262365354657361234115416546876"));

            long t3 = System.currentTimeMillis();

            for (long i = 0; i < 4000000; i++) {
                calculator.functionallyCalculateSuperDigitOf("326573563785469570947548945434893487639845954695678956789067889758");
            }

            System.out.println("Time3: " + (System.currentTimeMillis() - t3));
            System.out.println(calculator.functionallyCalculateSuperDigitOf("654327643785347649467984756437436575262365354657361234115416546876"));
            //     }
            System.out.println("Total execution time: " + (System.currentTimeMillis() - totalTime));
        }

    }
}
