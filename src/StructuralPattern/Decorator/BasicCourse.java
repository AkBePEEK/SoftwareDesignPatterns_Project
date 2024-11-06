package StructuralPattern.Decorator;

public class BasicCourse implements Course {
    @Override
    public String getDetails() {
        return "Basic Course Content";
    }
}
