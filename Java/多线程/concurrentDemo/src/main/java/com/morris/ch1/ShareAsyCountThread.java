<<<<<<< HEAD
package com.morris.ch1;

public class ShareAsyCountThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        count--;
        System.out.println("Thread " + Thread.currentThread().getName() + " count:" + count);
    }

    public static void main(String[] args) {
        ShareAsyCountThread thread = new ShareAsyCountThread();
        Thread a = new Thread(thread, "A");
        Thread b = new Thread(thread, "B");
        Thread c = new Thread(thread, "C");
        Thread d = new Thread(thread, "D");
        Thread e = new Thread(thread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
=======
package com.morris.ch1;

public class ShareAsyCountThread extends Thread {
    private int count = 5;

    @Override
    public void run() {
        count--;
        System.out.println("Thread " + Thread.currentThread().getName() + " count:" + count);
    }

    public static void main(String[] args) {
        ShareAsyCountThread thread = new ShareAsyCountThread();
        Thread a = new Thread(thread, "A");
        Thread b = new Thread(thread, "B");
        Thread c = new Thread(thread, "C");
        Thread d = new Thread(thread, "D");
        Thread e = new Thread(thread, "E");
        a.start();
        b.start();
        c.start();
        d.start();
        e.start();
    }
}
>>>>>>> 8d15f764d31a4751954af63ff5a72f44693230f4
