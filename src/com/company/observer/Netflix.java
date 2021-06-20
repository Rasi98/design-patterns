package com.company.observer;

import java.util.ArrayList;
import java.util.List;

//Netflix service provider
public class Netflix {

    List<Subscriber> subscriberList =new ArrayList<>();

    //subscribe
    public void subscribe(Subscriber subscriber){
        //can call database to add
        subscriberList.add(subscriber);
    }

    //Unsubscribe
    public void unsubscribe(Subscriber subscriber){
        //can call database to remove
        subscriberList.remove(subscriber);
    }

    // Notify subscribers
    public void notifyObservers(String news){
        for (Subscriber subscriber : subscriberList) {
            subscriber.notifyObserver(news);
        }
    }
}
