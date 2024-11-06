package BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Course_ObserverPattern {
    private final List<Observer> subscribers = new ArrayList<>();

    public void addSubscriber(Observer observer) {
        subscribers.add(observer);
    }

    public void removeSubscriber(Observer observer) {
        subscribers.remove(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer observer : subscribers) {
            observer.update(message);
        }
    }
}
