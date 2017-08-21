public class Main {

    public static void main(String[] args) {

        SuperdigitCalculator calculator = new SuperdigitCalculator();
        String numberToCalculateSuperdigitOf = "326573563785469570947548945434893487639845954695678956789067889758";
        System.out.println(calculator.imperativelyCalculateSuperDigitOf(numberToCalculateSuperdigitOf));
        System.out.println(calculator.functionallyCalculateSuperDigitOf(numberToCalculateSuperdigitOf));

    }

}
