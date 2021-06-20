package com.company.observer;

//Pro package subscriber
public class PackageProSubscribers implements Subscriber {
    @Override
    public void notifyObserver(String news) {
        System.out.println("Package Pro subscriber:"+news);
    }
}
