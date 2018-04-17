import utils.*;

class sentenceprint {
    public static void main(String[] args) {
        sentenceExample();
    }

    public static void sentenceExample() {
        String sentence = randomsentence.generateSentence();
        System.out.println(sentence);
    }

}