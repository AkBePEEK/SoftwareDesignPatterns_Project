package model.patterns.CreationalPattern.BuilderPattern;

import model.Course;
import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class CourseBuilder {
    private final Course course;

    public CourseBuilder(String title) {
        this.course = new Course(title);
    }

    public CourseBuilder addModule(ModuleComposite module) {
        course.add(module);
        return this;
    }

    public Course build() {
        return course;
    }
}
