import controller.CourseController;
import controller.EnrollmentController;
import controller.NotificationController;
import model.*;
import model.patterns.BehavioralPattern.ObserverPattern.NotificationObserver;
import model.patterns.BehavioralPattern.ObserverPattern.Subject;
import model.patterns.BehavioralPattern.StatePattern.PendingState;
import model.patterns.CreationalPattern.BuilderPattern.CourseBuilder;
import model.patterns.CreationalPattern.PrototypePattern.CoursePrototype;
import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;
import model.patterns.StructuralPattern.Decorator.CertificateDecorator;
import model.patterns.StructuralPattern.Decorator.QuizDecorator;
import view.CourseView;

public class Main {
    public static void main(String[] args) {
        // 1. Building a Course
        CourseBuilder courseBuilder = new CourseBuilder("Java Programming");
        Course course = courseBuilder
                .addModule(new Lesson("Introduction"))
                .addModule(new Lesson("Basic Syntax"))
                .build();

        // 3. Applying Decorator Pattern (Adding features)
        ModuleComposite moduleWithQuiz = new QuizDecorator(new CourseModule("Advanced Topics"));
        course.add(moduleWithQuiz);

        ModuleComposite moduleWithCertificate = new CertificateDecorator(new CourseModule("Final Exam"));
        course.add(moduleWithCertificate);

        // 4. State Pattern (Managing Enrollment)
        Enrollment enrollment = new Enrollment();
        EnrollmentController enrollmentController = new EnrollmentController(enrollment);
        enrollmentController.proceedEnrollment(); // Pending to Active
        enrollmentController.proceedEnrollment(); // Active to Completed

        // 5. Observer Pattern (Notifications)
        Subject courseNotifier = new Subject();
        NotificationObserver student1 = new NotificationObserver("Alice");
        NotificationObserver student2 = new NotificationObserver("Bob");

        courseNotifier.subscribe(student1);
        courseNotifier.subscribe(student2);

        NotificationController notificationController = new NotificationController(courseNotifier);
        notificationController.sendNotification(new Notification("Calculus", "New lesson available!"));

        // 6. Displaying Course with Composite Pattern
        CourseView courseView = new CourseView();
        courseView.displayCourse(course);
        Course course1 = new Course("Java Programming");
        CourseController courseController = new CourseController();

        // Add Modules
        courseController.addModule(new Lesson("Introduction to Java"));
        courseController.addModule(new Lesson("Object-Oriented Concepts"));

        // Display Course Modules
        CourseView courseView1 = new CourseView();
        courseView1.displayCourse(course1);

        ModuleComposite introModule = new Lesson("Introduction to Java");
        introModule.add(introModule);
        introModule.remove(introModule);

        Subject courseNotifier1 = new Subject();
        NotificationObserver student3 = new NotificationObserver("Alice");
        NotificationObserver student4 = new NotificationObserver("Bob");

        courseNotifier1.subscribe(student3);
        courseNotifier1.subscribe(student4);

        // Unsubscribe one observer
        courseNotifier1.unsubscribe(student4);

        // Sending a notification; only subscribed observers will receive it
        NotificationController notificationController1 = new NotificationController(courseNotifier1);
        notificationController1.sendNotification(new Notification("Java Programming", "New lesson available!"));

        // Call createCourse to create a new Course object
        courseController.createCourse();
    }
}
