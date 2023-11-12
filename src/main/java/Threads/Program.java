package Threads;

public class Program {

    public static void main(String[] args) {

        System.out.println("Main thread started...");
        Thread myThread = new Thread(new MyThread(), "just name");
        myThread.start();
        System.out.println("Main thread finished");

    }

    ///Watch 22 lesson


}
