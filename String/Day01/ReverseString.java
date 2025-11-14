class Sentence {
    String text = "Java is simple but powerful";
}

class FullReverse extends Sentence {
    void reverseString() {
        StringBuilder sb = new StringBuilder(text);
        System.out.println("Full Reverse → \"" + sb.reverse().toString() + "\"");
    }
}

class WordReverse extends Sentence {
    void reverseWords() {
        String[] words = text.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(new StringBuilder(word).reverse()).append(" ");
        }
        System.out.println("Word-wise Reverse → \"" + sb.toString().trim() + "\"");
    }
}
