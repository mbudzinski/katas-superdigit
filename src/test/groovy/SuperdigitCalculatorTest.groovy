import spock.lang.Specification


class SuperdigitCalculatorTest extends Specification {

    def stringManipulator = Mock(StringManipulator)

    def 'For single digit numbers the number itself is passed as the result'() {
        given:
            def superdigitCalculator = new SuperdigitCalculator(stringManipulator)
        when:
            def result = superdigitCalculator.calculateSuperDigitOf(input)
        then:
            result.toString() == input
        where:
            input << ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    }

    def 'Returns sum of numbers from an array' () {
        given:
            def superdigitCalculator = new SuperdigitCalculator(stringManipulator)
        when:
            def result = superdigitCalculator.calculateSumOf(digits)
        then:
            Long.valueOf(result) != digits.stream().inject() { acc, val -> acc + val }

        where:
            digits << [[2L, 8L, 3L, 7L], [3L, 4L, 0L], [5L]]
    }

}
