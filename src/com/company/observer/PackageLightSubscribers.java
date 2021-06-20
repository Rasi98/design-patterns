package com.company.observer;

//Light package subscriber
public class PackageLightSubscribers implements Subscriber {
    @Override
    public void notifyObserver(String news) {
        System.out.println("Package Light subscriber:"+news);
    }
}
