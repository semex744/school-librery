 public class Student extends Person {
    private String classroom;
    boolean parentPermission;

    public Student(int id, int age, String classroom, String name) {
        super(id, age, name);
        this.classroom = classroom;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
