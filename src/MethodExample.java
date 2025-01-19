public class MethodExample {
    // Fields
    private String message;

    // Constructor
    public MethodExample(String message) {
        this.message = message;
    }

    // Method to print the message
    public void printMessage() {
        System.out.println("Message: " + this.message);
    }

    // Static method to demonstrate static functionality
    public static void printStaticMessage() {
        System.out.println("This is a static method example.");
    }

    public static void main(String[] args) {
        // Create an instance of MethodExample
        MethodExample example = new MethodExample("Hello, World!");

        // Call instance methods
        example.printMessage();


        // Call static method
        MethodExample.printStaticMessage();
    }
}
