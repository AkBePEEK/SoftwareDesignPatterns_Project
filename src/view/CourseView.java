package view;

import model.Course;
import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class CourseView {
    public void displayCourse(Course course) {
        System.out.println("Course: " + course.getTitle());
        displayModules(course);
    }

    private void displayModules(ModuleComposite module) {
        System.out.println(module.toString());
        for (ModuleComposite child : module.getChildren()) {
            System.out.println(" - " + child.toString());
            displayModules(child);
        }
    }
}
