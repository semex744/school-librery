public class Person implements Nameable {
    int id;
    String name;
    int age;

    public Person(int id, int age, boolean parentPermission, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private boolean isOfAge() {
        return age >= 16;
    }

    public boolean canUseServices() {
        return isOfAge();
    }

    @Override
    public String getCorrectName() {
        return name;
    }
}