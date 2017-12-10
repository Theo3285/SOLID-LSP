public class Surrounder extends Replacer {

    public static Surrounder aParser() {
        return new Surrounder();
    }

    public Surrounder with(String aStringToParse) {
        super.with(aStringToParse);
        return this;
    }

    public Surrounder replaces(char aToken) {
        super.replaces(aToken);
        return this;
    }

    public String by(char anotherToken) {
        final int len = stringToParse.length;
        char[] result = new char[len];

        for (int charIndex = 0; charIndex < len; charIndex++) {
            final Character theChar = stringToParse[charIndex];

            result[charIndex] = theChar;
        }
        return token + String.valueOf(result) + anotherToken;
    }
}
