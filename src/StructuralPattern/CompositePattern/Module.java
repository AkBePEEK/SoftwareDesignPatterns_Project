package StructuralPattern.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Module extends CourseComponent {
    private final String name;
    private final List<CourseComponent> lessons = new ArrayList<>();

    public Module(String name) {
        this.name = name;
    }

    public void addLesson(CourseComponent lesson) {
        lessons.add(lesson);
    }

    @Override
    public void showContent() {
        System.out.println("Module: " + name);
        for (CourseComponent lesson : lessons) {
            lesson.showContent();
        }
    }
}
