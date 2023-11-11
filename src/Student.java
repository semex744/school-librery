public class Student extends Person {
    private String classroom;

    public Student( int age, String classroom, boolean parentPermission, String name) {
        super( age, parentPermission, name);
        this.classroom = classroom;
    }
}