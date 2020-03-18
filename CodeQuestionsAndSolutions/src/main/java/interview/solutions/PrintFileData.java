package interview.solutions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//read data from file
public class PrintFileData {
    public static void main(String[] args) {
        String fileName = "/Users/rustem/Projects/IdeaProjects/siteSeleniumTest/params.txt";
        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}