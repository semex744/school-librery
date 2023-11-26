public class Teacher extends Person {
    private String specialization;

    public Teacher( String name,int age,boolean parentPermission,String specialization) {
        super( name,age,parentPermission);
        this.specialization = specialization;
    }

    @Override
    public boolean canUseServices() {
        return true;
    }
}