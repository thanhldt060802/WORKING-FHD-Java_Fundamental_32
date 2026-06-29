public class ManagementSystem {

    public static final int EXCEL_TYPE = 1;
    public static final int BINARY_TYPE = 2;

    private DataStorage storage;

    public ManagementSystem() {
        
    }

    public DataStorage getStorage() {
        return storage;
    }

    public void setStorage(DataStorage storage) {
        this.storage = storage;
    }

    public void add() {
        this.storage.saveData();
    }
    
}
