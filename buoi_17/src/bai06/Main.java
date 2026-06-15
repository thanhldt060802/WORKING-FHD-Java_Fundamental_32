package bai06;

public class Main {

    public static void main(String[] args) {
        
        Dictionary dict = new Dictionary();
        dict.addWord("dog", "chó con");
        dict.addWord("cat", "mèo con");
        dict.addWord("cat", "con mèo");

        dict.showAllWords();

    }

}