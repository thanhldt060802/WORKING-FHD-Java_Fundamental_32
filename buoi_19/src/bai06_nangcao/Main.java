package bai06_nangcao;

public class Main {

    public static void main(String[] args) {
        
        Dictionary dict = new Dictionary();

        System.out.println("addWord");
        dict.addWord("dog", "chó con");
        dict.addWord("puppy", "chó con");
        dict.addWord("cat", "mèo con");
        dict.addWord("cat", "con mèo");
        dict.showAllWords();

        // System.out.println("updateWord");
        // dict.updateWord("cat", "con mèo", "con mèo con");
        // dict.showAllWords();

        // System.out.println("removeWordByEnglishKey");
        // dict.removeWordByEnglishKey("dog");
        // dict.showAllWords();

        // System.out.println("removeMeanOfWordByEnglishKey");
        // dict.removeMeanOfWordByEnglishKey("cat", "con mèo");
        // dict.removeMeanOfWordByEnglishKey("dog", "chó con");
        // dict.showAllWords();

        // System.out.println("containsEnglishKey");
        // // System.out.println(dict.containsEnglishKey("monkey"));
        // System.out.println(dict.containsMean("con khỉ"));

        // System.out.println("getEnglishKeyList");
        // System.out.println(dict.getEnglishKeyList());

        System.out.println("getMeansList");
        System.out.println(dict.getMeansList());

    }

}