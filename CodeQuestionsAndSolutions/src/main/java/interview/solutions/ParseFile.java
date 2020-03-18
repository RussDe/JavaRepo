package interview.solutions;

import java.io.*;
import java.util.Scanner;
//import java.FileNotFoundException;


//FileReader
public class ParseFile {

    private static void parser(String fileName) throws IOException {
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) System.out.println(sc.nextLine().toString());
    }

    //from  file as a BufferedReader
    private static void parseFileBuilder(String fileName) {

        try {
            FileReader fr = new FileReader(fileName);

            BufferedReader br = new BufferedReader(fr);
            while (br.readLine() != null) {
                System.out.println(br.readLine());
            }
            br.close();
        }
        catch(FileNotFoundException e){
            System.out.println("File not found " + e);
        }
        catch (IOException e){
            System.out.println("Reading file error" + e);
        }
    }
    //to file as a fileWriter
    private static void fileWriter(String fileNameOut) {
        String myString = "I love to code";
        try{
            FileWriter fw = new FileWriter(fileNameOut);
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i=0; i < myString.length(); i++){
                if(myString.charAt(i)!=' ') {
                    bw.write(myString.charAt(i));
                    bw.newLine();
                }
            }
            bw.close();
        }
        catch (IOException e){
            System.out.println("File can’t be created"+e);
        }
    }

    public static void main(String[] args) throws IOException {
        String fileName = "/Users/rustem/Projects/IdeaProjects/Automation_interview_questions/test4.txt";
        String fileNameOut = "/Users/rustem/Projects/IdeaProjects/Automation_interview_questions/test5.txt";
        parser(fileName);
        System.out.println("\n***********************************");
        parseFileBuilder(fileName);
        System.out.println("\n***********************************");
        fileWriter(fileNameOut);
    }
}