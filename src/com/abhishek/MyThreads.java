package com.abhishek;


class multiThread extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getId());
    }
}
class multiRunnable implements Runnable{
    private int x;
    public multiRunnable(int x){
        this.x=x;
    }
    public void run(){
        System.out.println(x*x);
    }
}

public class MyThreads {
    public static void main(String[] args){
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
            Thread object
                    = new Thread(new multiRunnable(i));
            object.start();
        }
    }
}
