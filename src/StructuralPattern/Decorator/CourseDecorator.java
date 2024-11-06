package StructuralPattern.Decorator;

public abstract class CourseDecorator implements Course{
    protected Course course;

    public CourseDecorator(Course course) {
        this.course = course;
    }

    public abstract String getDetails();
}
