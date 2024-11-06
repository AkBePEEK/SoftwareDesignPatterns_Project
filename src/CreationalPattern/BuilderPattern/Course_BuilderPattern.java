package CreationalPattern.BuilderPattern;

import java.util.List;

public class Course_BuilderPattern {
    private final List<String> modules;
    private final List<String> quizzes;
    private final List<String> assignments;

    public Course_BuilderPattern(List<String> modules, List<String> quizzes, List<String> assignments) {
        this.modules = modules;
        this.quizzes = quizzes;
        this.assignments = assignments;
    }

    @Override
    public String toString() {
        return "Course{" + "modules=" + modules + ", quizzes=" + quizzes + ", assignments=" + assignments + '}';
    }
}
