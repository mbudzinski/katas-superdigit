import spock.lang.Specification


class SuperdigitCalculatorTest extends Specification {

     def 'For single digit numbers the number itself is passed as the result'() {
        when:
            def functionalResult = superdigitCalculator.functionallyCalculateSuperDigitOf(input)
            def imperativeResult = superdigitCalculator.imperativelyCalculateSuperDigitOf(input)
        then:
            functionalResult.toString() == input
            imperativeResult.toString() == input
        where:
            input << ["0", "1", "2", "3", "4", "5", "6", "7", "8", "9"]
    }

    def 'The result is always a single digit'() {
        when:
            def functionalResult = superdigitCalculator.functionallyCalculateSuperDigitOf(input)
            def imperativeResult = superdigitCalculator.imperativelyCalculateSuperDigitOf(input)
        then:
            functionalResult >= 0 && functionalResult <= 9
            imperativeResult >= 0 && imperativeResult <= 9
        where:
            input << ["35763563", "542542", "246554367654874", "25346745254385", "9769567845",
                      "123143215", "1111111111", "10000000", "8487548", "21"]
    }

    def 'When the number of superdigit cycles is the same for the input and incremented input then the result from incremented input is larger by 1'() {
        when:
            def inputIncremented = input + 1
            def functionalResult = superdigitCalculator.functionallyCalculateSuperDigitOf(input)
            def imperativeResult = superdigitCalculator.imperativelyCalculateSuperDigitOf(input)
            def functionalIncrementedResult = superdigitCalculator.functionallyCalculateSuperDigitOf(inputIncremented)
            def imperativeIncrementedResult = superdigitCalculator.functionallyCalculateSuperDigitOf(inputIncremented)
        then:
            functionalIncrementedResult == functionalResult + 1
            imperativeIncrementedResult == imperativeResult + 1
            functionalResult == imperativeResult
            imperativeIncrementedResult == functionalIncrementedResult
        where:
            input << ['222', '111', '521']
    }


    SuperdigitCalculator superdigitCalculator = new SuperdigitCalculator()

}
