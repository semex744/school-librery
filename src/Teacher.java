 public class Teacher extends Person {
    private String specialization;

    public Teacher(int id, int age, String specialization, boolean parentPermission, String name) {
        super(id, age, name);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}