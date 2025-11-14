class CountWordsInAString {
    public static void main(String[] args) {
        String str = "I love programming";
        String[] words = str.trim().split("\\s+");
        System.out.println("Word count: " + words.length);
    }
}
