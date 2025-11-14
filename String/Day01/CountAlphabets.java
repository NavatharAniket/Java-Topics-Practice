class CharData {
    protected char[] data;

    CharData(char[] data) {
        this.data = data;
    }
}

class AlphabetCounter extends CharData {
    AlphabetCounter(char[] data) {
        super(data);
    }

    public int countAlphabets() {
        int count = 0;
        for (char ch : data) {
            if (Character.isLetter(ch))
                count++;
        }
        return count;
    }
}

class DigitSpecialCounter extends CharData {
    DigitSpecialCounter(char[] data) {
        super(data);
    }

    public void countDigitAndSpecial() {
        int digits = 0, special = 0;
        for (char ch : data) {
            if (Character.isDigit(ch))
                digits++;
            else if (!Character.isLetter(ch))
                special++;
        }
        System.out.println("Digits → " + digits);
        System.out.println("Special Characters → " + special);
    }
}
