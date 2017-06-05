import spock.lang.Specification


class SuperdigitIntegrationTest extends Specification{

    def 'Superdigit of 98741 equals to 2' () {
        given:
            def superdigitCalculator = new SuperdigitCalculator()
        when:
            def imperativeResult = superdigitCalculator.imperativelyCalculateSuperDigitOf("98741")
            def functionalResult = superdigitCalculator.functionallyCalculateSuperDigitOf("98741")
        then:
            Long.valueOf(functionalResult) == 2L
            Long.valueOf(imperativeResult) == 2L
    }

}
