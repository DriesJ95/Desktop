package be.intecbrussel;

public class MyThread implements Runnable {

    private char c;
    private int count;

    public MyThread(char c, int count){
        this.c = c;
        this.count = count;
    }

    @Override
    public void run() {
        for (int i =0; i < count; i++){
            System.out.print(c);
        }
    }
}
