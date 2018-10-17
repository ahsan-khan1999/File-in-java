import java.io.*;
public class TestFile {
    public static void main(String[] args) throws IOException{


        File FileName = new File("FileName.txt");
        PrintStream printStream = new PrintStream(FileName);
        FileWriter fileWriter = new FileWriter(FileName,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);

        FileName.createNewFile();
        printStream.print("ahsan khan ::dasdsas");

            }}


