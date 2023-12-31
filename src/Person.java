

 public class Person implements Nameable {
    int id;
    String name;
    int age;
    boolean parentPermission=true;

    public Person(int id, int age, String name) {
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
        return age >= 18;
    }

    public boolean canUseServices() {
        return isOfAge();
    }

    @Override
    public String getCorrectName() {
        return name;
    }

    public Rental rentBook(Book book, String date) {
        Rental rental = new Rental(date, book, this);
        return rental;
    }
}
