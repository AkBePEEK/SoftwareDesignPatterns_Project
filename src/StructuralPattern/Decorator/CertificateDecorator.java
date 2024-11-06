package StructuralPattern.Decorator;

public class CertificateDecorator extends CourseDecorator{
    public CertificateDecorator(Course course) {
        super(course);
    }

    @Override
    public String getDetails() {
        return course.getDetails() + " + Certificate Provided";
    }
}
