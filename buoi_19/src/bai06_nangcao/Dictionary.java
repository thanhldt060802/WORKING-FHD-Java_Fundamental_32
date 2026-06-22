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
            // Có thể xử lý thêm để đảm bảo một Word không chứa những mean bị trùng
        } else {
            Word newWord = new Word(englishKey);
            newWord.add(mean);
            super.add(newWord);
        }
    }

    public void updateWord(String englishKey, String oldMean, String newMean) {
        Word existedWord = this.searchWordByEnglishKey(englishKey);
        if (existedWord == null) {
            return;
        }

        for (int i = 0; i < existedWord.size(); i++) {
            if (existedWord.get(i).equals(oldMean)) {
                existedWord.set(i, newMean);
                return;
            }
        }
    }

    public void removeWordByEnglishKey(String englishKey) {
        Word existedWord = this.searchWordByEnglishKey(englishKey);
        if (existedWord == null) {
            return;
        }

        this.remove(existedWord);
    }

    public void removeMeanOfWordByEnglishKey(String englishKey, String mean) {
        Word existedWord = this.searchWordByEnglishKey(englishKey);
        if (existedWord == null) {
            return;
        }

        for (String existedMean : existedWord) {
            if (existedMean.equals(mean)) {
                existedWord.remove(existedMean);
                return;
            }
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

    public boolean containsEnglishKey(String englishKey) {
        Word existedWord = this.searchWordByEnglishKey(englishKey);
        if (existedWord == null) {
            return false;
        }

        return true;
    }

    public boolean containsMean(String mean) {
        for (Word word : this) {
            for (String existedMean : word) {
                if (existedMean.equals(mean)) {
                    return true;
                }
            }
        }

        return false;
    }

    public ArrayList<String> getEnglishKeyList() {
        ArrayList<String> result = new ArrayList<>();
        for (Word word : this) {
            result.add(word.getEnglishKey());
        }
        return result;
    }

    public ArrayList<ArrayList<String>> getMeansList() {
        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (Word word : this) {
            result.add(word);
        }
        return result;
    }
    
}
