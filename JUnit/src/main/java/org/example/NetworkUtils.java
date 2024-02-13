package org.example;

public class NetworkUtils {
    public static void getConnection(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return;
    }
}
