package model.patterns.CreationalPattern.PrototypePattern;

import model.Course;

public class CoursePrototype implements Cloneable {
    @Override
    public Course clone() {
        try {
            return (Course) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}