package StructuralPattern.CompositePattern;

public class Lesson extends CourseComponent {
    private final String name;

    public Lesson(String name) {
        this.name = name;
    }

    @Override
    public void showContent() {
        System.out.println("Lesson: " + name);
    }
}
