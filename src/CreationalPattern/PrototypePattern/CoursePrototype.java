package CreationalPattern.PrototypePattern;

public class CoursePrototype implements Cloneable {
    private final String title;
    private final String content;

    public CoursePrototype(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public CoursePrototype clone() throws CloneNotSupportedException {
        return (CoursePrototype) super.clone();
    }

    @Override
    public String toString() {
        return "CourseModule{" + "title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}