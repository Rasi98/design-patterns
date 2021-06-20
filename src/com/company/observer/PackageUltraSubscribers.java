package com.company.observer;

//Ultra package subscriber
public class PackageUltraSubscribers implements Subscriber {
    @Override
    public void notifyObserver(String news) {
        System.out.println("Package Ultra subscriber"+news);
    }
}
