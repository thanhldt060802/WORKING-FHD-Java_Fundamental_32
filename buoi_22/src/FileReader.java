public interface FileReader {

    public void loadData();

    default void decodeData() {
        System.out.println("Default data decoding...");
    }
    
}
