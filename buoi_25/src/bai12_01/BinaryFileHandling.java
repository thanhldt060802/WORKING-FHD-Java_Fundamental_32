package bai12_01;

import java.util.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BinaryFileHandling implements DataFileHandling {
    
    private String pathFile;

    public BinaryFileHandling(String pathFile) {
        this.pathFile = pathFile;
    }

    public String getPathFile() {
        return pathFile;
    }

    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }

    @Override
    public void loadData(List<Account> output) {
        try (
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
        ) {
            while (true) {
                Object obj = ois.readObject();
                if (obj instanceof Account)
                    output.add((Account)obj);
            }
        } catch (EOFException e) {
            // DONE
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveData(List<Account> input) {
        try (
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
        ) {
            for (Account acc: input) 
                oos.writeObject(acc);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BinaryFileHandling [pathFile=" + pathFile + "]";
    }
}