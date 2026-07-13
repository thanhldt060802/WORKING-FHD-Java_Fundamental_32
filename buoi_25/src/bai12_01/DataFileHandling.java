package bai12_01;

import java.util.List;

public interface DataFileHandling {
    
    public abstract void loadData(List<Account> output);
    public abstract void saveData(List<Account> input);
    
}
