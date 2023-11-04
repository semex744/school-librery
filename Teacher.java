public class Teacher extends Person {
    private String specialization;

    public Teacher(int id, int age, String specialization, boolean parentPermission, String name) {
        super(id, age, parentPermission, name);
        this.specialization = specialization;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}
