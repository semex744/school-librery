/*public class Student extends Person {
    private String classroom;

    public Student( String name,int age,boolean parentPermission,String classroom) {
        super(name,age,parentPermission);
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}*/
class Student extends Person {
    private String classroom;

    public Student(String name,int age,boolean parent_permission) {
        super(name,age,parent_permission);
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = String.valueOf(classroom);
    }
}
