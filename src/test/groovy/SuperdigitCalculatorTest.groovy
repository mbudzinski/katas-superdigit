import spock.lang.Specification


class SuperdigitCalculatorTest extends Specification {

    def 'For single digit numbers the number itself is passed as the result'() {
        given:
            def superdigitCalculator = new SuperdigitCalculator()
        when:
            def result = superdigitCalculator.calculateSuperDigitOf(number)
        then:
            result.toString() == number
        where:
            number << ["0","1","2","3","4","5","6","7","8","9"]

    }

}