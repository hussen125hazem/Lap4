import java.util.Scanner;

/**
 * Created by Arabic on 31/01/22.
 */
public class TestArrayQue {

    public static void main(String[] args) {
        ArrayQueue<Character> q = new ArrayQueue<>(5);
        Scanner s = new Scanner(System.in);
        System.out.println("The queue is Empty " + q.isEmpty());
        System.out.println("Please Enter the queue elements");

        for (int i = 0; i <5 ; i++) {
            q.enqueue(s.next().charAt(0));
            System.out.println("first element is "+q.first());
            System.out.println("Size ="+ q.size());
        }
        while (!q.isEmpty())
        {
            System.out.print(q.dequeue()+"\t");
        }
    }
}
