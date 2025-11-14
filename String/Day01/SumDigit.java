class NumberData {
    protected String numberStr;

    NumberData(String numberStr) {
        this.numberStr = numberStr;
    }
}

class DigitSum extends NumberData {
    DigitSum(String numberStr) {
        super(numberStr);
    }

    public int calculateSum() {
        int sum = 0;
        for (char ch : numberStr.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        return sum;
    }
}

class EvenOddCounter extends NumberData {
    EvenOddCounter(String numberStr) {
        super(numberStr);
    }

    public void countEvenOdd() {
        int even = 0, odd = 0;
        for (char ch : numberStr.toCharArray()) {
            int digit = Character.getNumericValue(ch);
            if (digit % 2 == 0)
                even++;
            else
                odd++;
        }
        System.out.println("Even digits → " + even);
        System.out.println("Odd digits → " + odd);
    }
}
