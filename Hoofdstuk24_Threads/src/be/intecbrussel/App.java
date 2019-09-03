package be.intecbrussel;

public class App {
    public static void main(String[] args) {
       /** MyThread run1 = new MyThread('ù',100);
        MyThread run2 = new MyThread('*',100);
        */

        Thread thread1 = new Thread(() -> print('#',500));
        Thread thread2 = new Thread(() -> print('@',500));
        Thread thread3 = new Thread(() -> print('&',500));

        thread1.start();
        thread2.start();
        thread3.start();

        System.out.println("\n" + Runtime.getRuntime().availableProcessors() + "\n");
    }
    private static void print(char c, int count){
        for (int i = 0; i < count; i++){
            System.out.print(c);
            Thread.yield();
        }
    }
}
