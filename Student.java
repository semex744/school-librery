public class Student extends Person {
    private String classroom;

    public Student(int id, int age, String classroom, boolean parentPermission, String name) {
        super(id, age, parentPermission, name);
        this.classroom = classroom;
    }
    }
