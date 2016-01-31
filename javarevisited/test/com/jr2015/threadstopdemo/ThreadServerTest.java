package com.jr2015.threadstopdemo;

import java.util.concurrent.TimeUnit;
import static java.lang.Thread.currentThread;

public class ThreadServerTest {

    public static void main(String args[]) throws InterruptedException {

        ThreadServer myServer = new ThreadServer();
        Thread t1 = new Thread(myServer, "T1");
        t1.start();

        //Let the server thread run a while
        // TimeUnit.MILLISECONDS.sleep(1);

        //Now, let's stop our Server thread
        System.out.println(currentThread().getName() + " is stopping Server thread");
        myServer.stop();

        //Let's wait to see server thread stopped
        TimeUnit.MILLISECONDS.sleep(200);
        System.out.println(currentThread().getName() + " is finished now");
    }
}
