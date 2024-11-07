package controller;

import model.Notification;
import model.patterns.BehavioralPattern.ObserverPattern.Subject;

public class NotificationController {
    private final Subject courseNotifier;

    public NotificationController(Subject notifier) {
        this.courseNotifier = notifier;
    }

    public void sendNotification(Notification notification) {
        courseNotifier.notifyObservers(notification);
    }
}
