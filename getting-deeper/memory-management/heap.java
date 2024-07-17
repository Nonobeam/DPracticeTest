import java.util.Scanner;

public class heap {
    public static void main(String[] args) {

        // New keyword is used to create object in heap.
        // Heap store sc1 and sc2
        // Reference to object is stored in stack.
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("SC1: ");
        var a = sc1.nextLine();

        System.out.println("SC2: ");
        var b = sc2.nextLine();

        // Garbage colelction clean sc1 and sc2 from here.
        // In heap, garbage collection is mandatory.
        System.out.println("SC1: " + a);
        System.out.println("SC2: " + b);
    }
}
