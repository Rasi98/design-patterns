package com.company.observer;

public class Main {

    public static void main(String[]args) throws InterruptedException {
        //publisher->subject
        //subscriber->observer
        //observer types-> light , pro , ultra
            Subscriber lightsubscriber =new PackageLightSubscribers();
            Subscriber prosubscriber = new PackageProSubscribers();
            Subscriber ultraSubscribers=new PackageUltraSubscribers();

        Netflix netflix =new Netflix();
        netflix.subscribe(lightsubscriber);
        netflix.subscribe(prosubscriber);
        netflix.subscribe(ultraSubscribers);

        //Notify all the subscribers
        netflix.notifyObservers("Welcome to the Netflix!");

        Thread.sleep(5000);//wait for 5 seconds
        System.out.println("..............................");
        netflix.notifyObservers("Let's watch....");

        Thread.sleep(5000);//wait for 5 seconds
        netflix.unsubscribe(prosubscriber);//pro user unsubscribe
        System.out.println("..............................");
        prosubscriber.notifyObserver("You unsubscribed!");

        Thread.sleep(5000);//wait for 5 seconds
        System.out.println("..............................");
        netflix.notifyObservers("These are the new movies...");
    }
}
