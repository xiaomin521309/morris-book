<<<<<<< HEAD
package com.morris.ch1;

public class ThreadImpl1 implements Runnable{
    @Override
    public void run() {
        System.out.println("This thread is implement Runnable interface.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadImpl1()); // ThreadImpl1线程无法直接启动，需借助另外一个线程才能启动
        thread.start();
    }
}
=======
package com.morris.ch1;

public class ThreadImpl1 implements Runnable{
    @Override
    public void run() {
        System.out.println("This thread is implement Runnable interface.");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new ThreadImpl1()); // ThreadImpl1线程无法直接启动，需借助另外一个线程才能启动
        thread.start();
    }
}
>>>>>>> 8d15f764d31a4751954af63ff5a72f44693230f4
