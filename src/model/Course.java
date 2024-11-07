package model;

import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class Course extends ModuleComposite {
    private final String title;

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
