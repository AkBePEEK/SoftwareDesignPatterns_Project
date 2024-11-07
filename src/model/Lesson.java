package model;

import model.patterns.StructuralPattern.CompositePattern.ModuleComposite;

public class Lesson extends ModuleComposite {
    private final String title;

    public Lesson(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Lesson: " + title;
    }
}
