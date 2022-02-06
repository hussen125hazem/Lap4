import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Arabic on 31/01/22.
 */
public class printFilesInConsole {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in= new Scanner(System.in);
        ArrayQueue<String> q= new ArrayQueue<>(3);
        System.out.println("input file path to print");
        for (int i = 0; i <3 ; i++) {
            q.enqueue(in.next());

        }
        while (!q.isEmpty())
            //System.out.println(q.dequeue());
        {
            Scanner fileScanner = new Scanner(new File(q.dequeue()));
            while (fileScanner.hasNextLine())
                System.out.println(fileScanner.nextLine());


        } }
}
