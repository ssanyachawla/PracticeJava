package CodePractice;//public class CodePractice.Main extends Thread {
////    the extend method is a way to create thread
//    public static int amount=0;
//
//    public static void main(String[] args) {
//        CodePractice.Main thread= new CodePractice.Main();
////        Thread can be run by passing an instance of the class
//        thread.start();
//        System.out.println(amount);
//        amount++;
//        System.out.println(amount);
//    }
//    public void run(){
//        amount++;
//    }
//}
// To avoid concurrency problem we use isAlive() method of thread to check if thread has finished working before using any attributes thatthe thread can change

public class Main extends Thread {
    //    the extend method is a way to create thread
    public static int amount=0;

    public static void main(String[] args) {
        Main thread= new Main();
//        Thread can be run by passing an instance of the class
        thread.start();
//        this start method causes the run method to execute in the new thread

//        this loop will repeatedly check if the thread is alive waiting until the thread terminates
        while(thread.isAlive()){
            System.out.println("waiting..");
        }
//        update amount and print its value
        System.out.println(amount);
        amount++;
        System.out.println(amount);
    }
    public void run(){
        amount++;
    }
}

//start() method begins the thread execution
//run() method increments amount by 1
//while(thread.isAlive()) loop ensures the main thread waits until the run method finishes executing
//this eliminates the race condition
