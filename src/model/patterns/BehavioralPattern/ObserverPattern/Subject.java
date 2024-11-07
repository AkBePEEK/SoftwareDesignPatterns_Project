package model.patterns.BehavioralPattern.ObserverPattern;
import model.Notification;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private final List<Observer> observers = new ArrayList<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(Notification notification) {
        for (Observer observer : observers) {
            observer.update(notification);
        }
    }
}
