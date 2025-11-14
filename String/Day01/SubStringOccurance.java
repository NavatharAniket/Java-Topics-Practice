class SentenceData {
    protected String sentence;

    SentenceData(String sentence) {
        this.sentence = sentence;
    }
}

class SubstringCounter extends SentenceData {
    SubstringCounter(String sentence) {
        super(sentence);
    }

    public int countOccurrences(String sub) {
        int count = 0;
        int index = 0;
        while ((index = sentence.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }
}

class WordReverser extends SentenceData {
    WordReverser(String sentence) {
        super(sentence);
    }

    public String reverseEachWord() {
        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }
        return result.toString().trim();
    }
}
