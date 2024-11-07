package controller;

import model.Course;
import model.patterns.CreationalPattern.BuilderPattern.CourseBuilder;
import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class CourseController {
    private final CourseBuilder builder;

    public CourseController() {
        builder = new CourseBuilder("New Course");
    }

    public void addModule(ModuleComposite module) {
        builder.addModule(module);
    }

    public void createCourse() {
        Course course = builder.build();
        System.out.println("Course created: " + course.getTitle());
    }
}
