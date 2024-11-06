package CreationalPattern.PrototypePattern;

public class CourseModule_PrototypePattern implements Cloneable {
    private final String title;
    private final String content;

    public CourseModule_PrototypePattern(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public CourseModule_PrototypePattern clone() throws CloneNotSupportedException {
        return (CourseModule_PrototypePattern) super.clone();
    }

    @Override
    public String toString() {
        return "CourseModule{" + "title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}