package api.homework.homework2.bubblesort;

import java.io.File;
import java.io.FileWriter;

import java.io.IOException;

import api.homework.mytools;

public class BubbleSort {
    
    public static void main(String[] args) {

    }

    public static void run(int[] array){
        writeBubbleLog(array);
    }

    static void writeBubbleLog(int array[]){
        try{
            File bubbleSortLog = new File("api/homework/homework2/bubblesort/bubbleSortLog.txt");
            FileWriter logWrite = new FileWriter(bubbleSortLog, true);
            logWrite.write("Исходный массив:\n" + mytools.printArray(array) + "\n");
            logWrite.write("Отсортированный массив:\n" + sortBubble(array) + "\n" + "\n");
            logWrite.close();
        }
               
        catch (IOException ex) {
            System.out.println("error!");
        }
        
    }

    static String sortBubble(int[] arr){
        for (int i = 0; i <= arr.length - 1; i++){
            for (int j = 0; j <= arr.length - 2; j++){
                if (arr[j] > arr[j+1]) {
                    int n = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = n;
                }
            }
        }
        return mytools.printArray(arr);
         
    }    
}
