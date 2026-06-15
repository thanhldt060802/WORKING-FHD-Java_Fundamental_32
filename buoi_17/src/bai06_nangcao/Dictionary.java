package bai06_nangcao;

import java.util.ArrayList;

public class Dictionary extends ArrayList<Word> {

    public void showAllWords() {
        for (Word word : this) {  // for (Word word : ArrayList<Word>)
            System.out.println(word);
        }
    }

    public void addWord(String englishKey, String mean) {
        Word existedWord = this.searchWordByEnglishKey(englishKey);
        if (existedWord != null) {
            existedWord.add(mean);
        } else {
            Word newWord = new Word(englishKey);
            newWord.add(mean);
            super.add(newWord);
        }
    }

    public Word searchWordByEnglishKey(String englishKey) {
        for (Word word : this) {
            if (word.getEnglishKey().equals(englishKey)) {
                return word;
            }
        }
        return null;
    }
    
}
