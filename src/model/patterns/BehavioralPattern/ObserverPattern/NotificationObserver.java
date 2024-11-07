package model.patterns.BehavioralPattern.ObserverPattern;

import model.Notification;

public class NotificationObserver  implements Observer {
    private final String name;

    public NotificationObserver(String name) {
        this.name = name;
    }

    public void update(Notification notification) {
        System.out.println(name + " received notification: " + notification);
    }
}
