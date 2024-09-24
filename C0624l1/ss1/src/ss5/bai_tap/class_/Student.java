package ss5.bai_tap.class_;

public class Student {

    private String name = "Tuan";
    private String classes = "C06";
    public Student() {}

    public Student(String name, String classes) {
        this.name = name;
        this.classes = classes;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setClasses(String classes) {
        this.classes = classes;
    }

    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", classes='" + classes + '\'' + '}';
    }
}
