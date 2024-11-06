package CreationalPattern.PrototypePattern;

public class CourseModule implements Cloneable {
    private final String title;
    private final String content;

    public CourseModule(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public CourseModule clone() throws CloneNotSupportedException {
        return (CourseModule) super.clone();
    }

    @Override
    public String toString() {
        return "CourseModule{" + "title='" + title + '\'' + ", content='" + content + '\'' + '}';
    }
}