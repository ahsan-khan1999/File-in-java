import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public abstract class AdvanceFile implements Flushable{

        public static void main(String[] args) throws IOException {

            File store = new File("Store.txt");
//            Reading Data From File.
//            Scanner s = new Scanner(store);
//            System.out.println(s.delimiter());
//            System.out.println(s.hasNextLine());
//            System.out.println(s.hasNext());
//            System.out.println(s.locale());
            //System.out.println(s.radix());
//            System.out.println(s.toString());
//            System.out.println(s.tokens());
//            System.out.println(s.n);
//            while (s.hasNext()){
//                System.out.println(s.nextLine());
//            }

//            Writing Data to File!!
            PrintStream stream = new PrintStream(store);
            FileWriter fileWriter = new FileWriter(store,true);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);
            if(store.exists() == false){
                store.createNewFile();
                System.out.println("The file has been created!!");
            }
            else {
                System.out.println("the file is already created!");
            }

            printWriter.print("hello world!!");


            printWriter.append('c');
            printWriter.append('s');
//            System.out.println(printWriter.checkError());
//            System.out.println(printWriter.flush());
//            flush is used for an output stream
//            IOException - if an I/O error occurs.
//                    printWriter.close();




        }
    }
