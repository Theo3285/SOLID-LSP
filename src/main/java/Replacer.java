class Replacer {
    protected Character[] stringToParse;
    protected char token;

    public static Replacer aParser() {
        return new Replacer();
    }

    public Replacer with(String aStringToParse) {

        int len = aStringToParse.length();
        stringToParse = new Character[len];

        for (int charIndex = 0; charIndex < len ; charIndex++) {
            stringToParse[charIndex] = aStringToParse.charAt(charIndex);
        }

        return this;
    }

    public Replacer replaces(char aToken) {
        this.token = aToken;
        return this;
    }

    public String by(char anotherToken) {

        final int len = stringToParse.length;
        char[] result = new char[len];

        for (int charIndex = 0; charIndex < len; charIndex++) {

            final Character theChar = stringToParse[charIndex];

            if (theChar == token) {
                result[charIndex] = anotherToken;
            } else {
                result[charIndex] = theChar;
            }
        }

        return String.valueOf(result);
    }


}
