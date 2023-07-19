package api.homework.homework2.task3;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class OutputFortat {

    public static void main(String[] args) {
        
    }

    static void rearFile(){
        
        try{
            File students = new File("api/homework/homework2/task3/students.txt");
            FileReader fileReader = new FileReader(students);
            char[] arrFile = new char[300];
            fileReader.read(arrFile);

            formatFile(arrFile);

            // for (char i : arrFile){
            //     System.out.print(i);
            // }
            //System.out.println(arrFile);
            fileReader.close();
        }
        catch (IOException ex) {
            System.out.println("error!");
        }
    }
    
    
    static void formatFile(char[] file){
        //
    }
}