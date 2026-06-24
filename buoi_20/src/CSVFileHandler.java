public class CSVFileHandler extends FileHandler {

    @Override
    public void read() {
        System.out.println("Day la tinh nang doc du lieu tu file csv");
    }

    @Override
    public void write() {
        throw new UnsupportedOperationException("Tinh nang nay khong duoc thiet ke");
    }
    
}
