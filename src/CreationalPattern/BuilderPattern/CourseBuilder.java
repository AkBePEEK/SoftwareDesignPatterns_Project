package CreationalPattern.BuilderPattern;

import java.util.ArrayList;
import java.util.List;

public class CourseBuilder {
    private final List<String> modules = new ArrayList<>();
    private final List<String> quizzes = new ArrayList<>();
    private final List<String> assignments = new ArrayList<>();

    public CourseBuilder addModule(String module) {
        modules.add(module);
        return this;
    }

    public CourseBuilder addQuiz(String quiz) {
        quizzes.add(quiz);
        return this;
    }

    public CourseBuilder addAssignment(String assignment) {
        assignments.add(assignment);
        return this;
    }

    public Course_BuilderPattern build() {
        return new Course_BuilderPattern(modules, quizzes, assignments);
    }
}
