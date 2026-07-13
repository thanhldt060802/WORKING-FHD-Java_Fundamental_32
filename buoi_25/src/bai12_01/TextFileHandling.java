package bai12_01;

import java.util.List;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class TextFileHandling implements DataFileHandling {
    
    private String pathFile;

    public TextFileHandling(String pathFile) {
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
            FileReader fileReader = new FileReader(pathFile);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
        ) {
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null)
                    break;

                String[] rawInfo = line.split(", ");
                String id = rawInfo[0];
                String pin = rawInfo[1];
                int balance = Integer.parseInt(rawInfo[2]);

                output.add(new Account(id, pin, balance));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void saveData(List<Account> input) {
        try (
            FileWriter fileWriter = new FileWriter(pathFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        ) {
            for (Account acc: input) {
                bufferedWriter.write(String.format("%s, %s, %d", acc.getId(), acc.getPin(), acc.getBalance()));
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "TextFileHandling [pathFile=" + pathFile + "]";
    }
}