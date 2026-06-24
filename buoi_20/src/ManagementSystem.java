public class ManagementSystem {

    private FileHandler fileHandler;

    public ManagementSystem(FileHandler fileHandler) {
        this.fileHandler = fileHandler;
    }

    public void saveData() {
        this.fileHandler.write();
    }

    public void loadData() {
        this.fileHandler.read();
    }
    
}
