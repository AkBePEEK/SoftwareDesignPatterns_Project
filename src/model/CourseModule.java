package model;

import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class CourseModule extends ModuleComposite {
    private final String title;

    public CourseModule(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Module: " + title;
    }
}
