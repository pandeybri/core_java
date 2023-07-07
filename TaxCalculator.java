package thread_core_java;

public class TaxCalculator {
 public static void main(String[] args) {
        nisha obj = new nisha();
        obj.start();

        rathod obj2 = new rathod();
        obj2.start();
    }
}

class nisha extends Thread
{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("nisha: i=" + i);
        }
    }
}

class rathod extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("rathod: i=" + i);
        }
    }
}

