package StructuralPattern.CompositePattern;

public class Lesson extends ModuleComposite {
    private String title;

    public Lesson(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Lesson: " + title;
    }
}
