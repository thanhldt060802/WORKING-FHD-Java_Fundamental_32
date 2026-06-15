package bai06;

import java.util.ArrayList;

public class Word {

    private String englishKey;
    private ArrayList<String> means;

    public Word(String englishKey) {
        this.englishKey = englishKey;
        this.means = new ArrayList<>();
    }

    public String getEnglishKey() {
        return englishKey;
    }

    public ArrayList<String> getMeans() {
        return means;
    }

    public void setEnglishKey(String englishKey) {
        this.englishKey = englishKey;
    }

    public void setMeans(ArrayList<String> means) {
        this.means = means;
    }

    @Override
    public String toString() {
        return "Word [englishKey=" + englishKey + ", means=" + means + "]";
    }
    
}
