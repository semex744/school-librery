public class Teacher extends Person {
    private String specialization;

    public Teacher( int age, String specialization, boolean parentPermission, String name) {
        super( age, parentPermission, name);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}