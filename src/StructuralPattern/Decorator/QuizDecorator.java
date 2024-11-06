package StructuralPattern.Decorator;

public class QuizDecorator extends CourseDecorator{
    public QuizDecorator(Course course) {
        super(course);
    }

    @Override
    public String getDetails() {
        return course.getDetails() + " + Quiz Included";
    }
}
