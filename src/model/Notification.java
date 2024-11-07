package model;

public record Notification(String courseTitle, String message) {

    @Override
    public String toString() {
        return "Course: " + courseTitle + " - " + message;
    }
}
