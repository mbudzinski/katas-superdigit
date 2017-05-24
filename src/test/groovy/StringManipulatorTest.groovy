import spock.lang.Specification


class StringManipulatorTest extends Specification {


    def 'Returns a string without last char'() {
        given:
            def stringManipulator = new StringManipulator()
        when:
            def result = stringManipulator.removeLastCharFrom(input)
        then:
            result == input.substring(0, input.length() -1)
        where:
            input << ["someInput", "1234566", "53267357854678543563476347", "testtest"]
    }

    def 'Returns the last char from the given string'() {
        given:
            def stringManipulator = new StringManipulator()
        when:
            def result = stringManipulator.getLastCharFrom(input)
        then:
            result == input.substring(input.length() - 1)
        where:
            input << ["someInput", "1234566", "53267357854678543563476347", "testtest"]
    }



}
