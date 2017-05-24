/**
 * Created by marcin on 24.05.17.
 */
public class StringManipulator {

    public String removeLastCharFrom(String string) {
        return string.substring(0, string.length() - 1);
    }

    public String getLastCharFrom(String string) {
        return string.substring(string.length() - 1);
    }

}
