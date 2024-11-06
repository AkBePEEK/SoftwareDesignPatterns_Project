import BehavioralPattern.ObserverPattern.*;
import BehavioralPattern.StatePattern.*;
import CreationalPattern.BuilderPattern.*;
import CreationalPattern.PrototypePattern.*;
import StructuralPattern.CompositePattern.*;
import StructuralPattern.CompositePattern.Module;
import StructuralPattern.Decorator.*;

public class Main {
    public static void main(String[] args) {
        StructuralPattern. Decorator. Course course1 = new BasicCourse();
        StructuralPattern. Decorator. Course courseWithQuiz = new QuizDecorator(course1);
        StructuralPattern. Decorator. Course courseWithCertificate = new CertificateDecorator(courseWithQuiz);
        System.out.println(courseWithCertificate.getDetails());

        Enrollment enrollment = new Enrollment();
        enrollment.proceed(); // Transition to Active
        enrollment.proceed(); // Transition to Completed

        Course_BehavioralObserverPattern course = new Course_BehavioralObserverPattern();
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        course.addSubscriber(user1);
        course.addSubscriber(user2);
        course.notifySubscribers("New assignment available!");

        Module module = new Module("Programming Basics");
        module.addLesson(new Lesson("Lesson 1: Variables"));
        module.addLesson(new Lesson("Lesson 2: Loops"));
        module.showContent();

        Course_BuilderPattern course2 = new CourseBuilder()
                .addModule("Introduction Module")
                .addQuiz("Quiz 1")
                .addAssignment("Assignment 1")
                .build();
        System.out.println(course2);

        try {
            CourseModule_PrototypePattern baseModule = new CourseModule_PrototypePattern("Introduction", "Welcome to the course!");
            CourseModule_PrototypePattern clonedModule = baseModule.clone();
            System.out.println(clonedModule);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}