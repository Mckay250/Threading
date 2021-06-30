package com.decema;

import com.decema.service.OxRunnable;
import com.decema.service.OxThread;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        OxThread thread1 = new OxThread();

        OxRunnable runnable1 = new OxRunnable();
        Thread thread2 = new Thread(runnable1);

//        thread1.setDaemon(true);
        thread2.setDaemon(true);

        thread1.start();
//        thread1.join(3000); // The calling thread waits for 3000ms
        thread2.start();

        System.out.println(3/0);
    }
}
