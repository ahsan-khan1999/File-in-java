import java.io.*;

public class Fille {
    public static void main(String[] args) throws IOException {


        File myFile = new File("myFile.txt");
        PrintStream stream = new PrintStream(myFile);
        FileWriter fileWriter = new FileWriter(myFile,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter printWriter = new PrintWriter(bufferedWriter);
        if(myFile.exists() == false){
            myFile.createNewFile();
            System.out.println("The file has been created!!");
        }
        else {
            System.out.println("the file is already created!");
        }

        printWriter.print("hello world!!");
        printWriter.close();
    }
}
