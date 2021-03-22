package DATAStructure;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.LinkedList;
import java.util.Stack;

public class DataReader1 {

    private static Object FileReader;

    public static void main(String[] args) {
        String textFile = System.getProperty("user.dir") + "/src/data/DATASTRUCTURE.iml";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        String line;
        String center;
        String store = " ";
        try {
            FileReader = new FileReader(textFile);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        try {
            bufferedReader = new BufferedReader(bufferedReader);
            while ((line = bufferedReader.readLine())!= null){
                  store += null;
            }
        }catch (Exception e){
            System.out.println("error unable to read");
        }
        String[] storeArray = store.split("");
        Stack<String> stack = new Stack<>();
        LinkedList<String> linkedList = new LinkedList<>();

        for (String element : storeArray){
            linkedList.add(element);
            stack.push(element);
        }
        System.out.println("LinkedList FIFO : ");

        System.out.print(linkedList.remove());
        while (linkedList.isEmpty());
        System.out.print(linkedList.remove());
        System.out.println();

        System.out.println("Stack.FILE :");

        while (stack.isEmpty());
        System.out.println(stack.pop());
    }

}
