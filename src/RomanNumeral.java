public enum RomanNumeral {
    I("I", 1), II("II", 2), III("III", 3), IV("IV", 4), V("V", 5), VI("VI", 6), VII("VII", 7), VIII("VIII", 8), IX("IX", 9), X("X", 10),
    XI("XI", 11), XII("XII", 12), XIII("XIII", 13), XIV("XIV", 14), XV("XV", 15), XVI("XVI", 16), XVII("XVII", 17), XVIII("XVIII", 18),
    XIX("XIX", 19), XX("XX", 20);
    private int value;

    private String key;
    public int numbers;

    RomanNumeral(String key, int value) {
        this.value = value;
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public String getKey() {
        return key;
    }

    static int toInt(String key) {
        for (RomanNumeral i : RomanNumeral.values()) {
            if (i.getKey().equals(key))
                return i.getValue();
        }

        return 0;
    }

    static String toStr(int value) {
        for (RomanNumeral i : RomanNumeral.values()) {
            if (i.getValue() == value)
                return i.getKey();
        }
        return ("");
    }
}



