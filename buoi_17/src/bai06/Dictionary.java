package bai06;

import java.util.ArrayList;

public class Dictionary {

    private ArrayList<Word> wordList;

    public Dictionary() {
        this.wordList = new ArrayList<>();
    }

    public void showAllWords() {
        for (Word word : this.wordList) {
            System.out.println(word);
        }
    }

    public void addWord(String englishKey, String mean) {
        Word existedWord = this.searchWordByEnglishKey(englishKey);
        if (existedWord != null) {
            existedWord.getMeans().add(mean);
        } else {
            Word newWord = new Word(englishKey);
            newWord.getMeans().add(mean);
            this.wordList.add(newWord);
        }
    }

    public Word searchWordByEnglishKey(String englishKey) {
        for (Word word : this.wordList) {
            if (word.getEnglishKey().equals(englishKey)) {
                return word;
            }
        }
        return null;
    }
    
}
