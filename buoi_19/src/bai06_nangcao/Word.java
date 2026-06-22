package bai06_nangcao;

import java.util.ArrayList;

public class Word extends ArrayList<String> {

    private String englishKey;

    public Word(String englishKey) {
        this.englishKey = englishKey;
    }

    public String getEnglishKey() {
        return englishKey;
    }

    public void setEnglishKey(String englishKey) {
        this.englishKey = englishKey;
    }

    @Override
    public String toString() {
        return "Word [englishKey=" + englishKey + ", means=" + super.toString() + "]";
    }
    
}
