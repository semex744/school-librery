public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int id, int age, boolean parentPermission, String name) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Person(int id, int age) {
        this(id, age, true, "Unknown");
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
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge();
    }
}
