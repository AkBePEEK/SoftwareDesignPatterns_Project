package model.patterns.BehavioralPattern.ObserverPattern;

import model.Notification;

public interface Observer {
    void update(Notification notification);
}
