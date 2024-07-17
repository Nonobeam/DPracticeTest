class stack {
    // Global variable is stored in heap
    // Static memory (data segment)
    private static String firstGlobal = "First Global";

    // Global variable is stored in heap
    // Non-static memory 
    private String secondGlobal = "Second Global";


    // args is stored in stack
    public static void main(String[] args) {
        // Stack store a and b
        var a = "A";
        var b = "B";

        // Stack is cleaned after this line.
        // In stack, garbage collection is not mandatory.
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}
