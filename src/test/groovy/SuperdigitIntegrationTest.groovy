import spock.lang.Specification


class SuperdigitIntegrationTest extends Specification{

    def 'Superdigit of 98741 equals to 2' () {
        given:
            def stringManipulator = new StringManipulator()
            def superdigitCalculator = new SuperdigitCalculator(stringManipulator)
        when:
            def result = superdigitCalculator.calculateSuperDigitOf("98741")
        then:
            Long.valueOf(result) == 2L
    }

}
