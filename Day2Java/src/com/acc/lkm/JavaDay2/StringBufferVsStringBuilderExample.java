package com.acc.lkm.JavaDay2;

public class StringBufferVsStringBuilderExample {
	public static void main(String[] args) {
        // Accuracy
        accuracyExample();
 
        // Synchronization
        synchronizationExample();
 
        // Performance
        performanceExample();
    }
 
    private static void accuracyExample() {
        // StringBuffer is synchronized and thread-safe
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Hello");
        stringBuffer.append(" ");
        stringBuffer.append("World");
        System.out.println("StringBuffer Output: " + stringBuffer.toString());
 
        // StringBuilder is not synchronized
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Hello");
        stringBuilder.append(" ");
        stringBuilder.append("World");
        System.out.println("StringBuilder Output: " + stringBuilder.toString());
    }
 
    private static void synchronizationExample() {
        StringBuffer stringBuffer = new StringBuffer();
 
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                stringBuffer.append("a");
            }
        };
 
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
 
        thread1.start();
        thread2.start();
 
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        System.out.println("StringBuffer Length: " + stringBuffer.length());
    }
 
    private static void performanceExample() {
        long startTime, endTime;
        int iterations = 100000;
        // StringBuffer Performance
        StringBuffer stringBuffer = new StringBuffer();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuffer.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");
 
        // StringBuilder Performance
        StringBuilder stringBuilder = new StringBuilder();
        startTime = System.nanoTime();
        for (int i = 0; i < iterations; i++) {
            stringBuilder.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}
