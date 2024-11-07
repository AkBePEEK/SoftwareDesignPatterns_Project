package CreationalPattern.PrototypePattern;

public class CoursePrototype implements Cloneable {
    private Course course;

    public CoursePrototype(Course course) {
        this.course = course;
    }

    public Course clone() {
        try {
            return (Course) course.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}