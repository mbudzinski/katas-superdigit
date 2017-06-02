import spock.lang.Specification


class SuperdigitIntegrationTest extends Specification{

    def 'Superdigit of 98741 equals to 2' () {
        given:
            def superdigitCalculator = new SuperdigitCalculator()
        when:
            def result = superdigitCalculator.calculateSuperDigitOf("98741")
        then:
            Long.valueOf(result) == 2L
    }

}
